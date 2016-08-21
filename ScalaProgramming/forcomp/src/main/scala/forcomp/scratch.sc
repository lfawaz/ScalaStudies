val x = "count This String"
def isPrime(n: Int): Boolean = (2 until n) forall (d => n%d != 0)


x.toLowerCase.groupBy(identity).mapValues(_.size).toList




val l = List("apple","bannana")

val t = l.mkString.filter(_.isLetter)

type Occurrences = List[(Char, Int)]

type Word = String

def wordOccurrences(w: Word): Occurrences =
  w.toLowerCase.groupBy(identity).mapValues(_.size).toList


val a: Word = "ate"
val b: Word = "tea"
val c: Word = "test"




val dict: Map[Occurrences,List[Word]] =  Map(wordOccurrences(a)
  -> List(a,b), wordOccurrences(c) -> List(c))



val k: Occurrences = List(('a', 2), ('b', 2))
/*
k.length

implicit class Crossable[X](xs: Traversable[X]) {
  def cross[Y](ys: Traversable[Y]) = for { x <- xs; y <- ys } yield (x, y)
}


val allcomb =
for {
  i <- 0 until k.length
  j <- 1 to k(i)._2
} yield List((k(i)._1,j))


allcomb.toSet

allcomb cross allcomb

*/
def combinations(occurrences: Occurrences): List[Occurrences] = occurrences match {
  case Nil => List(List())
  case x :: xs =>
    for {
      z <- combinations(xs)
      n <- 0 to x._2
    } yield (if (n == 0) z else (x._1, n) :: z)
}

val x1 = List(('a', 1), ('d', 1), ('l', 1), ('r', 1))
val y1 = List(('r', 1),('a',1))


val u = x1.toMap
val v = y1.toMap withDefaultValue(0)

val j = (u foldLeft v)(removeTerm)

j.filter(x=>x._2 > 0)

def removeTerm(occurrences: Map[Char,Int], occurrence: (Char,Int)) : Map[Char,Int] = {
  val (c, i) = occurrence
  occurrences + (c -> (i - occurrences(c)))
}



subtract(x1,v.toList)

def subtract(x: Occurrences, y: Occurrences): Occurrences = {
  def removeTerm(occurrences: Map[Char,Int], occurrence: (Char,Int)) : Map[Char,Int] = {
    val (c, i) = occurrence
    occurrences + (c -> (i - occurrences(c)))
  }

  val y1 = y.toMap withDefaultValue(0)
  val j = (x foldLeft y1 )(removeTerm)

  j.filter(x=>x._2 > 0).toList


}
//x1.toMap.keySet.intersect(y1.toMap.keySet)




//x1.filterNot(y1.toSet)

//def subtract(x: Occurrences, y: Occurrences): Occurrences = x.filterNot(y.toSet)


//subtract(x1,y1)