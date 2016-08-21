

abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, Left: Expr, Right: Expr) extends Expr


def generalSize(x:Any) = x match {
  case s: String => s.length
  case m: Map[x,y] => m.size
  case l: List => l.length
  case _ => -1

}

generalSize(Map(1->2))



def describe(x: Any) = x match {
  case 5 => "five"
  case Nil => "This is Nil"
  case true => true
  case List(x,y) => "This is a list"
  case something => "something else " + something
  case _ => "something completely different"
}

describe(Nil)

import math.{E, Pi}

E match {
  case Pi => "This is Pi: " + Pi
  case _ => "Ok"
}



E match {
  case pi => "This is Pi??: " + Pi
  case _ => "Ok"
}

val expr2 = BinOp("+",Var("A"),Number(0))

expr2 match {
  case BinOp("+", e, Number(0)) => println("a deep match")
  case _ => "Not a deep match"
}


val expr1 = List(0,1,2)
expr1 match {
  case List(_*) => println("found it")
  case _ =>
}