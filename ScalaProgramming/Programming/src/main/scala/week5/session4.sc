/*
def squareList(xs: List[Int]): List[Int] =
  xs match {
    case Nil => xs
    case y :: ys => (y * y) :: squareList(ys)
  }
*/



def squareList(xs: List[Int]): List[Int] =
  xs map (x => x*x)


val x = List(1,2,3,4)

val y = squareList(x)



def pack[T](xs: List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x :: xs1 =>
    if (x == xs1.head) x :: xs1
    else pack(xs1)
}

pack(List("a", "a", "a", "b", "c", "c", "a"))