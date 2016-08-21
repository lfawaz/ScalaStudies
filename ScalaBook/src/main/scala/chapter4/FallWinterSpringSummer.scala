/**
  * Created by lfawaz on 7/16/16.
  */
import ChecksumAccumulator.calculate

object FallWinterSpringSummer extends  App {

  for (season <- List("fall", "winter", "spring"))
    println(season +": "+ calculate(season))


}
