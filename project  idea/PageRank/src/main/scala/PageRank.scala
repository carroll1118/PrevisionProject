import Array._
import org.apache.spark.HashPartitioner

object PageRank{
  def main(args: Array[String]): Unit = {
    val file = sc.textFile("hdfs://192.168.100.10/user/zhihu/relation_2.csv")

    val user_tmp = file.map(a=>a.split(",")).reduce((x,y)=>concat(x,y))
    val user = sc.parallelize(user_tmp).distinct()
    val initial_value = 1/(user.count().toDouble)
    var ranks_total = user.map(v=>(v,initial_value))

    val user_relation = file.map(a=>a.split(",")).map(b=>(b(0),b(1))).groupByKey.collect
    val links = sc.parallelize(user_relation).partitionBy(new HashPartitioner(100)).persist()
    var ranks=links.mapValues(v=>initial_value)

    for (i <- 0 until 50) {
      val contributions=links.join(ranks).flatMap{case(pageId,(links,rank)) => links.map(dest=>(dest,rank/links.size))}
      ranks = contributions.reduceByKey((x,y)=>x+y).mapValues(v=> 0.15*initial_value + 0.85*v)
      ranks_total = ranks_total.union(ranks)
    }

    val result =  ranks_total.groupByKey.sortByKey().collect()
    val result_tmp = result.map(x => (x._1,x._2.toList))
    val result_filter = sc.parallelize(result_tmp).filter(x=>x._2.length > 1).collect()
    val final_result = result_filter.map(a=>(a._1,a._2.reverse(0)))
    val Node_pageRank = sc.parallelize(final_result).saveAsTextFile("hdfs://192.168.100.10/user/zhihu/relation_output")
  }
}