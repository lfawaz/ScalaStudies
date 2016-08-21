def queens(n: Int): Set[List[Int]] = {
  def placeQueens(k: Int): Set [List[Int]] =
    if (k == 0) Set(List())
    else{
      for {
        queens <- placeQueens(k - 1)
        col <- 0 until n
        if isSafe(col, queens)
      } yield  col :: queens
    }
placeQueens(n)
}

def isSafe(col: Int, queens: List[Int]): Boolean = {

  val row = queens.length
  val queensWithRows = (row -1 to 0 by -1) zip queens
  queensWithRows forall {
    case (r,c) => col != c && math.abs(col - c) != row - r
  }

}


def show(queens: List[Int]) = {
  val lines =
    for (col <- queens.reverse) yield
      Vector.fill(queens.length)("* ").updated(col,"X ").mkString
      "\n" + (lines mkString "\n") + "\n"


}


val x = queens(4).toList
val y = x(1)

val z = show(y)


val a = List(List("a"),"b","c")

a(0)
//queens(4) map show

//val queens1 = List(1,3,0)

//val queensWithRows = (4 -1 to 0 by -1) zip queens1


