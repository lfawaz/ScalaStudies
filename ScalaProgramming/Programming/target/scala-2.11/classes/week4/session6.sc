
/**
  * Created by lfawaz on 6/26/16.
  */

trait Expr
case class Num(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr

def eval(e: Expr): Int = e match {
  case Num(n) => n
  case Sum(e1, e2) => eval(e1) + eval(e2)

}
def show(e: Expr): String = e match {
  case Num(n) => n.toString
  case Sum(e1, e2) => show(e1) + " + " + show(e2)
}

show(Sum(Num(1),Num(44)))


