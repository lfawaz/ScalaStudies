import scalashop._

val numTasks = 1
val w = 3
val h = 3
val src = new Img(w, h)
val dst = new Img(w, h)
src(0, 0) = 0; src(1, 0) = 1; src(2, 0) = 2
src(0, 1) = 3; src(1, 1) = 4; src(2, 1) = 5
src(0, 2) = 6; src(1, 2) = 7; src(2, 2) = 8

val x = 2
val y = 2
VerticalBoxBlur.parBlur(src, dst,  numTasks, 1)

dst(x,y)

VerticalBoxBlur.blur(src, dst,0, 3 , 1)

dst(x,y)

boxBlurKernel(src,x,y,1)


val steps = if(src.width - numTasks <= 0) 1 else src.width - (numTasks - 1)
val start = 0 until src.width by steps
val end = start.tail.map(x=>x) :+ src.width
val startEnd = start zip end
