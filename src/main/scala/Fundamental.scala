object Fundamental {


  def isEven(i: Int): Boolean = {i % 2 == 0}


  def main(args: Array[String]): Unit = {
    List.range(-12, 12).foreach(x => println(s"$x, ${isEven(x)}"))
  }
}
