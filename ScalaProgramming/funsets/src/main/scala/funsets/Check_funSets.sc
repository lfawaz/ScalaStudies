type Set = Int => Boolean

/**
  * Indicates whether a set contains a given element.
  */
def contains(s: Set, elem: Int): Boolean = s(elem)

// (x: Int) => x<0
// (x: Int) => true
// (x: Int) => false
// (x: Int) => x == 2
// (x: Int) => x == 10
// (x: Int) => x == 2 || x == 10
// (x: Int) => x % 2 == 0

//contains((x: Int) => x==10,2)


def singletonSet(elem: Int): Set = (x => x == elem)

singletonSet(3)(3)

def union(s: Set, t: Set): Set = (x => s(x) || t(x))

val s3 = union(Set(2,1),Set(1))

s3(3)

def intersect(s: Set, t: Set): Set = (x => s(x) && t(x))

val s4 = intersect(Set(2,1),Set(1))

s4(1)

def diff(s: Set, t: Set): Set = (x => s(x) != t(x))

val s5 = diff(Set(2,3,4,1),Set(4,1))

s5(4)


def filter(s: Set, p: Int => Boolean): Set = intersect(s,p)

val s6 = filter(Set(2,3,4,1,0,5),x=> x == 5)

!contains(s6,5)



/**
  * The bounds for `forall` and `exists` are +/- 1000.
  */
val bound = 1000

/**
  * Returns whether all bounded integers within `s` satisfy `p`.
  */
def forall(s: Set, p: Int => Boolean): Boolean = {
  def iter(a: Int): Boolean = {
    if (a == -bound) true
    else if (contains(s,a) && !contains(filter(s,p),a)) false
    else iter(a-1)
  }
  iter(bound)
}


def exists(s: Set, p: Int => Boolean): Boolean = {
  def iter(a: Int): Boolean = {
    if (a == -bound) true
    else if (contains(filter(s,p),a)) false
    else iter(a-1)
  }
  iter(bound)
}

def map(s: Set, f: Int => Int): Set = (e: Int) => exists(s, (x=> f(x) == e))
//def map(s: Set, f: Int => Int): Set = (e:Int) => exists(s, (x => f(x) == e))
