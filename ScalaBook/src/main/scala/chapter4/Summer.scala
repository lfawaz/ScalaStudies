/**
  * Created by lfawaz on 7/16/16.
  */
import ChecksumAccumulator._


object Summer{


  def main(args: Array[String]) {
    for(arg <- args)
      println(arg + ":" + calculate(arg))
  }

}