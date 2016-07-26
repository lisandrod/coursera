package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if ((c == 0) || (c == r)) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1) // 1 3 3 1
  }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      val cursor = 0
      def iter(c: Char, cur: Int, chars: List[Char]) : Boolean = {
        if (chars.isEmpty && (cur + evalChar(c)) == 0) true
        else if (chars.isEmpty) false
        else if (cur + evalChar(c) < 0) false
        else
          iter(chars.head, cur + evalChar(c) , chars.tail)
      }

      def evalChar(char: Char): Int = {
        if (char == '(') 1
        else if (char == ')') -1
        else 0
      }
      iter(chars.head, cursor, chars.tail)
  }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {

      if (money == 0) 1
      else if ( money > 0 && !coins.isEmpty) {
        //println("Money =" + money + ", coins = " + coins)
        countChange(money - coins.head, coins) + countChange(money, coins.tail)
      }else 0
    }
  }
