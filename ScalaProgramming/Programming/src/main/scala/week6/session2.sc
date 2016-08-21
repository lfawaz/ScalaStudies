def isPrime(n: Int): Boolean = (2 until n) forall (d => n%d != 0)

val n = 7


(1 until 7) flatMap (i =>
  (1 until i) map (j => (i,j)) filter(
    pair => isPrime(pair._1 + pair._2))
  )


for {
  i <- 1 until n
  j <- 1 until i
  if isPrime(i + j)

} yield  (i,j)


val a: List[Double] = List(1,2,3,4)
val b: List[Double] = List(3,1,2,5)

def scalarProduct(xs: List[Double], ys: List[Double]) : Double =
  ( for ((x,y) <- xs zip ys) yield  x * y ) sum


val z = a zip b

scalarProduct(a,b)

