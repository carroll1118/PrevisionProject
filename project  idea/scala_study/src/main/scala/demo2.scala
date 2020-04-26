package main.scala
object demo2{
  def main(args: Array[String]): Unit = {

    val list0 = List(2,5,9,6,7,1,8,3,4,0)

    //每个元素乘以2 生成一个新集合
    val list1 = list0.map(_ * 2)
//    print(list1)

   // filter 过滤，将偶数取出生成一个新的集合
    val list2 = list0.filter(_ % 2 == 0)
//    print(list2)

   // sorted 排序生成一个新的集合
    val list3 = list0.sorted
//    print(list3)

   //reverse 反转排序
    val list4 = list3.reverse
//    print(list4)

    //分组  4个一组
    val it = list0.grouped(4)
   // print(it.toBuffer)

    val list5 = it.toList
//    print(list5)

    val list6 = list5.flatten
//    print(list6)

    val lines = List("hello java hello scala","hello scala")
   // print(lines)

    //切分  split
    val words = lines.map(_.split(" "))
    //print(words)

    //压平   flatten
    val flattenWords = words.flatten
    //print(flattenWords)

    // flatMap   是  map 和 flatten 方法的结合
    /*val res = lines.flatMap(_.split(" "))
    print(res)*/

    //并行计算求和
    val arr = Array(1,2,3,4,5,6,7,8,9,10)
    /*val res = arr.sum
    print(res)*/

    //par   并行计算求和
   /* val res = arr.par.sum
    print(res)*/

    //按照特定的顺序进行聚合  reduceLeft
    // (((1+2)+3)+4)+5.....
    //val res = arr.reduce(_ + _)

    //进行并行方式聚合
    /*val res = arr.par.reduce(_ + _)
    print(res)*/

    val list7 = List(List(1,2,3),List(3,4,5),List(2),List(0))

    val res = list7.flatten.reduce(_+_)

   // val res = list7.aggregate(0)(_+_.sum,_+_)

    val l1 = List(5,6,4,7)
    val l2 = List(1,2,3,4)

    //并  union   交  intersect   差  diff
    val res1 = l1 union  l2


















  }

}
