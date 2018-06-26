object Square
{
  def SS( a: Int, b: Int) : Unit =
  {
    println("a square = " + (a*a));
    var sum= (a*a) + (b*b)
    println("sum of square = " + sum);
  }
  def main(args: Array[String])
  {
    println("Input number: ")
    var n=scala.io.StdIn.readInt()
    println("Input number: ")
    var m=scala.io.StdIn.readInt()
    SS(n,m);
  }
}

