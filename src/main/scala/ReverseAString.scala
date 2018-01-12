object ReverseAString {

  def main(args: Array[String]): Unit = {

    println("Enter a sentence you want reversed and press Enter.")

    val string = scala.io.StdIn.readLine()
    val reversedString = string.reverse

    println(reversedString)
  }

}