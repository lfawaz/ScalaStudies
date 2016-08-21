abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat = new Suc(this)
  def + (that: Nat): Nat
  def - (that: Nat): Nat
}

class Zero extends Nat {

  def isZero: Boolean = true
  def predecessor: Nat = throw new Error("predecessor")
  def + (that: Nat): Nat = that
  def - (that: Nat): Nat = if(that.isZero) this else throw new Error("predecessor")

}

class Suc(n: Nat) extends Nat {

  def isZero: Boolean = false
  def predecessor: Nat = n
  def + (that: Nat): Nat = new Suc(n + that)
  def - (that: Nat): Nat = if(that.isZero) this else n - that.predecessor

}