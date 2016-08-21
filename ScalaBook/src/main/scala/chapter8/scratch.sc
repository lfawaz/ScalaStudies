def echo(x: String*) =
  for (i <- x) println(i + "!")


echo("hello")

echo("hello","world")

val arr = Array("test","this","function")


echo(arr: _*)


def makeInc(more: Int) = (x: Int) => x + more


val xx = makeInc(10)

xx(10)

val x = List(List(-11, 10, 12),List(1,2))

x.foreach((x:List[Int]) => println(x))


x.filter((l:List[Int]) => l.head > 0)


var increase = (x:Int) => {
  println(x+3)
  x + 2
}

increase(10)

val someList = List(1,2,-10,5,3,22,-4)



someList.filter(x => x > 0)

someList.filter(_ > 0)


//WRONG!! val f = _ + _


val f = (_:Int) + (_:Int)


f(3,2)


def sum (a:Int, b:Int, c:Int) : Int = a + b + c

def b = sum(1, _ : Int, 2)

b(3)

var more = 10

val addmore = (x: Int) => x + more

addmore(10)

more = 200

addmore(20)

