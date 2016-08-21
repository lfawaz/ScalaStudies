object session5 {

  def sqrtIter(guess: Double, x: Double): Double =
    if(isGoodEnough(guess,x)) guess
    else sqrtIter(improve(guess,x), x)

  def isGoodEnough(guess: Double, x: Double) =
    math.abs(guess * guess - x) < 0.001

  def improve(guess: Double, x:Double) =
    (guess + x / guess) / 2

  def sqrt(x: Double) = sqrtIter(1, x)

  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  gcd(21,49)

 sqrt(2)
}