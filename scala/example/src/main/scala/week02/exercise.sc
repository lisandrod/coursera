import scala.annotation.tailrec

object exercise{

  def factorial(x: Int) = {

    @tailrec
    def acc(a: Int, y: Int): Int ={
      if (y == 0) a
      else acc( a * y, y -1)
    }
    acc(1, x)
  }

  factorial(5)
}