/**
  * Created by lfawaz on 6/21/16.
  */

package week3

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