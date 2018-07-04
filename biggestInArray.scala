object biggestInArray
{
  def main(args: Array[String])
  {
    var arraynum = new Array[Int](5)
    println("Input number");
    for( i <- 0 to arraynum.length-1)
    {
      arraynum(i) = scala.io.StdIn.readInt()
    }
    var max = arraynum(0)
    for( i <- 1 to arraynum.length-1)
    {
     if( max < arraynum(i))
     {
       max = arraynum(i);
     }
    }
    println("Maxinum number is " + max)
  }
}

