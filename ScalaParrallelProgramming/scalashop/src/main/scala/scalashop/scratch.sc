//val r1 = 0 until 10
//val r2 = r1.start until r1.end by r1.step + 1
//println(r2.length)



val numTasks = 500
val width = 32
val splittingPoints = 0 until width by 1 + (width - numTasks)

val endpoints = splittingPoints.tail.map(x=>x-1) :+ width - 1

val startend = splittingPoints zip endpoints

/*
for (se <- startend) {
    print(se._1)
    print (se._2)
}

import scala.collection.mutable.ListBuffer

var l = new ListBuffer[Int]

l += 1
l += 2

l.toList

l.sum
l.size

val radius = 1
var x = -radius

while (x <= radius){
  var y = -radius
  while (y <= radius){
    print(x,y)
    y = y + 1

  }
  x = x + 1
}


for {
  i <- 1 to 10
  j <- 1 until 4
} yield (i,j)


*/