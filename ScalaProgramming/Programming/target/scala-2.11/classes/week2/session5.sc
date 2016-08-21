object rationals{
  val x = new Rational(1,2)
  val y = new Rational(5,7)
  val z = new Rational(3,2)

  x.num
  x.den

  x.sub(y).sub(z)
  y.add(y)

  y.less(x)

  y.max(z)

  new Rational(2)

  class Rational(x: Int, y: Int) {

    def this(x: Int) = this(x, 1)
    require(y!=0,"denom must not be equal to zero")

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    def num = x
    def den = y

    def less(that: Rational) = num * that.den < that.num * den

    def max(that: Rational) = if(this.less(that)) that else this

    def add(that: Rational) =
      new Rational(num * that.den + that.num + den,
        den * that.den)

    def neg : Rational = new Rational(-num, den)

    def sub(that: Rational) = add(that.neg)

    override def toString = {
      val g = gcd(num,den)

      num / g + "/" + den / g
    }
  }


}


