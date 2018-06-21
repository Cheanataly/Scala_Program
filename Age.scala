object AgeDemo{
  def main(args: Array[String])
  {
    println("Input age:")
var num=scala.io.StdIn.readInt()
for(i <- 0 to num if (i%4!=0))
{
  print( i + "")
}
}

}
