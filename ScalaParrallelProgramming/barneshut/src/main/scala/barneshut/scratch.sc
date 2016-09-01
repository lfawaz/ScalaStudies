final class Point(val x: Int, val y: Int, val z:Int)


val x = new Point(1,2,3)
val y = new Point(2,3,4)
val z = new Point(4,5,6)

val l = List(x,y,z)


var t = 0

l.foreach( t += _.x)

def sumVal (x: Point) : Int = {


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