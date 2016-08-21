val l = List(-1,1,2,3)

l.fold(100)((x,y)=>x + y)
l.scan(100)((x,y)=>x + y)
l.foldRight(100)((x,y)=> x + y)
l.foldLeft(100)((x,y) => x + y)
l.takeRight(3)
l.take(2)
l.takeWhile(x=> x < 0)

val f = (x: Int) => x * x
val g = (x: Int) => x + 1

l.map(f.compose(g))

l.map(f).map(g)

l.map(g).map(f)
