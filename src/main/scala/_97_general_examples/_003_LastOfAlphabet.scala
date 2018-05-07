package _97_general_examples

/**
  * Find the farthest (last) letter of the alphabet in a given string
  */
object _003_LastOfAlphabet {
  def lastOfAlphabet(text: String): Char =
    text.map(_.toLower.toInt).distinct.max.toChar

  def main(args: Array[String]): Unit = {
    println(lastOfAlphabet("abcdefgZZ"))
    println(lastOfAlphabet("xzy"))
    println(lastOfAlphabet("xzY"))
    println(lastOfAlphabet("XyxxX"))
  }
}