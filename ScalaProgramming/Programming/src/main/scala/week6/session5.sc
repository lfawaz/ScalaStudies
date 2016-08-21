import scala.io.Source
/*

def charCode(mnemonics: Map[Char,String]) : Map[Char,Char] =
  for {
      (digit,str) <- mnemonics
       ltr <- str
    } yield (ltr -> digit)
 */


val in = Source.fromURL("http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/linuxwords.txt")

val words = in.getLines.toList filter (word => word forall(chr => chr.isLetter))

val mnemonics = Map(
  '2' -> "ABC", '3' -> "DEF", '4' -> "GHI", '5' -> "JKL",
  '6' -> "MNO", '7' -> "PQR", '8' -> "STUV", '9' -> "WXYZ"
)


val charCode: Map[Char,Char] =
  for {
      (digit,str) <- mnemonics
       ltr <- str
    } yield (ltr -> digit)


def wordCode(word: String): String =
  word.toUpperCase() map charCode

val wordsForNum: Map[String, Seq[String]] =
  words groupBy wordCode withDefaultValue Seq()


def encode(number: String): Set[List[String]] = {
  if(number.isEmpty) Set(List())
  else{
    for {
      split <- -1 to number.length
      word <- wordsForNum(number take split)
      rest <- encode(number drop split)

    } yield word :: rest

  }.toSet


}

def translate(number: String): Set[String] = {
  encode(number) map (_ mkString " ")

}

translate("7225247386")

