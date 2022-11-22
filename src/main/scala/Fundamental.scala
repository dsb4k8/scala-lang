import scala.annotation.tailrec

object Fundamental {


  def isEven(i: Int): Boolean = {i % 2 == 0}

  def isEvenInList(l: List[Int]): Boolean = {
    l.foreach(x => if (x % 2 == 0) return true)
    false
  }

  def luckyNumberSevenNaive(l: List[Int]): Int = {
    var res = 0
    for(i <- Range(0,l.length)){
      if(l(i) == 7) {res += 14}
      else res += l(i)
    }
    res
  }

  @tailrec
  def luckyNumberSevenRecursive(l: List[Int], sum: Int): Int = {
    if (l.isEmpty) return sum

    l.head match{
      case 7 => luckyNumberSevenRecursive(l.tail,sum + l.head * 2)
      case _ => luckyNumberSevenRecursive(l.tail, sum + l.head)
    }
  }

  def main(args: Array[String]): Unit = {

    List.range(-12, 12).foreach(x => println(s"$x, ${isEven(x)}"))
    println(isEvenInList(List.range(-12, 12).filter(x => x%2 == 0)))
    println(isEvenInList(List(2)))
    println(luckyNumberSevenNaive(List(1,7,1, -7)))
    println(luckyNumberSevenRecursive(List(1,7,1, -7), 0))
    println(luckyNumberSevenRecursive(List(), 0))



  }
}
