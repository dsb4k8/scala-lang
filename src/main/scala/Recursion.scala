import scala.annotation.tailrec

object Recursion {

//  working with recurrsion

  @tailrec
  def loop(i: Int, persist: Int = 0): Unit = {
    println(s"$i, Next: $i < ($persist + 10)")
    if(i < (persist + 10)){loop(i + 1, persist)}
  }


  @tailrec
  def Fibo(i: Int, n1: Int, n2: Int): Int = i match {
    case 0 => n1
    case 1 => n2
    case _ => Fibo(i-1, n2, n1 + n2)
  }

  @tailrec
  def Fact(i: Int, prev: Int = 1): Int = i match{
    case 0 => prev
    case 1 => prev
    case _ => Fact(i-1, i * prev)
  }

  @tailrec
  def isEven(i: Int): Boolean = i match {
    case 0 => true
    case 1 => false
    case _ => isEven(scala.math.abs(i)-2)
  }

  def main(args: Array[String]): Unit ={
//    loop(0 ,15)
    println(Fibo(60, 0, 1))
    println(Fact(30))

    println(isEven(-446))


  }


}
