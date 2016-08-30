


val abc: Map[Int,Seq[Int]] = Map(1 -> Vector(1,1,1),2 -> Vector(2,3,4),3 -> Vector(6,5,4))

val old = Vector(1,2,3,5)

def average(x: Seq[Int],oldMean: Int): Int = if(x.length ==0) oldMean else x.sum/x.length

val zips = List(2,3,4) zip  List(1,1,1)

zips map (x => x._1 - x._2)

old.exists(_ < 4)

Vector() zip Vector()

//abc.map{case (k,v)=> (average(v,k),v)}.keySet

//abc.toArray.indexWhere()

/*
val x = Set("Apple","Orange")
val y = Set("Apple","Orange")
val z = Set(true,false)


val a = x.groupBy(x=> y contains x )

val b = z.filterNot(x=> a.keySet contains x) map((_, Set[String]())) toMap

a ++ b
*/



