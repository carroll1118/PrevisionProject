/*构造器*/
class demo4(val name:String,var age:Int,faceValue:Int = 90) {
  def getFaceValue():Int = {
    faceValue
  }
}
object demo4{
  def main(args: Array[String]): Unit = {
    val s = new demo4("ningning",26)

    println(s.name)
    println(s.age)
    println(s.getFaceValue())


  }
}