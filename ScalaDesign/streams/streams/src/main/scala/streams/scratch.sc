import com.sun.tools.corba.se.idl.ValueEntry

//val a = Vector(Vector(1),2,3)

//if(a(0).isDefinedAt(0) == false) true else false


case class Pos(x: Int, y: Int) {
  /** The position obtained by changing the `x` coordinate by `d` */
  def dx(d: Int) = copy(x = x + d)

  /** The position obtained by changing the `y` coordinate by `d` */
  def dy(d: Int) = copy(y = y + d)
}

val level =
  """ooo-------
    |oSoooo----
    |ooooooooo-
    |-ooooooooo
    |-----ooToo
    |------ooo-""".stripMargin

val vector: Vector[Vector[Char]] =
  Vector(level.split("\n").map(str => Vector(str: _*)): _*)

val abc = vector.lift(1)
if (abc.isEmpty) Nil else abc.get.lift(1)
//val efg = abc.lift(1)

//if (efg.isEmpty) true else false

def terrainFunction(levelVector: Vector[Vector[Char]]): Pos => Boolean = {


  pos => {



    if (levelVector.lift(pos.x).isEmpty) false
    else if (levelVector(pos.x).lift(pos.y).isEmpty) false
    else if (levelVector(pos.x)(pos.y) == '-') false
    else true
  }
}


type Terrain = Pos => Boolean

val terrain: Terrain = terrainFunction(vector)

terrain(Pos(0,0))
terrain(Pos(1,1))
terrain(Pos(4,7))
terrain(Pos(5,8))
!terrain(Pos(5,9))
terrain(Pos(4,9))
!terrain(Pos(6,8))
!terrain(Pos(4,11))
!terrain(Pos(-1,0))
!terrain(Pos(0,-1))


