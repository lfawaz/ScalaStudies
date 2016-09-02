class Body(val mass: Float, val x: Float, val y: Float)

val x = new Body(1,2,3)
val y = new Body(3,4,5)
val z = new Body(6,7,8)

val l = Seq(x,y,z)

//works!
l.map(_.mass).reduce(_+_)

//works!
l.map(x=> (x.mass * x.x)).reduce(_ + _)

//errors!!
l.map((_.mass * _.x))

/*
a.fold(0)(_ + _)
a.reduce((x,y) => x + y)




val x = new Point(1,2,3)

val y = new Point(2,3,4)
val z = new Point(4,5,6)

val l = List(x,y,z)

findAverage(l)

class Point(val x: Double, val y: Double, val z: Double)


def findAverage(points: Seq[Point]): Double = {

    var x = 0.0
    var y = 0.0
    var z = 0.0
    points.seq.foreach { p =>
      x += p.x
      y += p.y
      z += p.z
    }
    x
    //new Point(x / points.length, y / points.length, z / points.length)

}

final class Points(val x: Int, val y: Int, val z: Int)


val xs = new Points(1,2,3)
val ys = new Points(2,3,4)
val zs = new Points(4,5,6)

val ls = Seq(xs,ys,zs)


sumVal(ls)

def sumVal (p: Seq[Points]) : Int = {
  var x = 0
  p.reduceLeft( p => x += p.x )
  x
}



for (x <- l) {
  println(x.x)
}





def x (x: Int): Unit = {
  if (x == 0)
    return println("Scala Wins")

  println("Bite Me")
}

x(0)

*/