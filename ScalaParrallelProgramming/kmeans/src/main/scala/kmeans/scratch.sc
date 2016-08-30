val x = Set("Apple","Orange")
val y = Set("Apple","Orange")
val z = Set(true,false)


val a = x.groupBy(x=> y contains x )

val b = z.filterNot(x=> a.keySet contains x) map((_, Set[String]())) toMap

a ++ b


//val c = Map(false -> Set())

//a ++ c

