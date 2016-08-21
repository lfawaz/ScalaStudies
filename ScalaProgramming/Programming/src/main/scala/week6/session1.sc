val x = Array(1,2,3,7,14)

x map (x => x * 2)

val y = "Hello World"

y filter (x => x.isUpper)

y exists (x => x.isUpper)
y forall (x => x.isUpper)

val a = List(1,2,3)
val b = List("a","b","c","d")

b zip a




1 to 10 by 3

20 to 10 by -2


def isPrime(n: Int): Boolean = (2 until n) forall (d => n%d != 0)


isPrime(114)