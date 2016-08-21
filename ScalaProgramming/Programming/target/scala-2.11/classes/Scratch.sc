import scala.collection.immutable.HashSet

val greetingString = new Array[String](3)

greetingString(0) = "Hello"
greetingString(1) = ","
greetingString(2) = "World!\n"


for (i <- 0 to 2)
  print(greetingString(i))

1 + 2

1 +(2)

1.+(2)

greetingString.update(0,"Update Hello")

for (i <- 0.to(2))
  print(greetingString.apply(i))

val numNames = Array("Zero","One","Two")


val onetwothree = List(1,2,3)

val onetwo = List(1,2)

val threefour = List(3,4)

val onetofour = onetwo ::: threefour

val onetwothree2 = 1 :: List(3,4)

val afterfour = List(3,4) ::: List(1)

val onetonil = 1 :: 2 :: 3 :: Nil


val pair = (99,"nine nine",1.1)

println(pair._3)

val x = scala.collection.mutable.HashSet("Airbus","Boeing")

x += "Jet"

print(x.contains("Jet"))


var map = Map[Int, String]()

map += (3 -> "First map")
map += (2 -> "Second map")


print(map(3))


val x = -1 to 10
val y =

