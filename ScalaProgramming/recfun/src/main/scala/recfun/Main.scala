package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)

      print(pascal(col, row) + " ")
      println()

    }
    println("Print Parentheses Balancing")
    println(balance("(if (zero? x) max (/ 1 x))".toList))
    println(balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList))
    println(balance(":-)".toList))
    println(balance("())(".toList))


    println("Print Count Change")
    println(countChange(100,List(1,2,5,10,20,50,100)))
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1 else pascal(c, r - 1) + pascal(c - 1, r - 1)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {

    def check(exp: List[Char], n: Int): Int =
      if (exp.isEmpty)
        n

      else if (exp.head == '(')
        check(exp.tail, n + 1)

      else if (exp.head == ')' && n > 0)
        check(exp.tail, n - 1)

      else
        check(exp.tail, n)


    if (chars.count(_.equals('(')) == chars.count(_.equals(')'))) check(chars, 0) == 0
    else false
  }


  /**
    * Exercise 3
    **/
  def countChange(money: Int, coins: List[Int]): Int = {

    def recur(m: Int, c :List[Int], n:Int): Int =
      if (m<0) n

      else if(c.isEmpty) {
        if(m==0) n + 1 else n
      }
      else recur(m, c.tail, n) + recur(m - c.head, c, n)
    recur(money, coins, 0)
    }

}