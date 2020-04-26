object demo3 {
  def main(args: Array[String]): Unit = {
    val lines = List("hello java hello python","hello scala","hello scala hello java hello scala")
    /*val words = lines.map(_.split(" "))

    val word = words.flatten*/
    val words = lines.flatMap(_.split(" "))
//    println(words)
    val tuples = words.map((_,1))
   // print(tuples)
    val grouped = tuples.groupBy(_._1)
   // print(grouped)
    val sumed = grouped.mapValues(_.size)
  //  print(sumed)
    val sorted = sumed.toList.sortBy(_._2).reverse
    print(sorted)

    val sorted = sumed.filter()



  }

}
