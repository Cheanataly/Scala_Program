object Demo
{
  def main(args: Array[String])
  {
    var a=0;
    var b=0;
    for( a <- 1 to 10; b <- 1 to 10)
    { 
      println( a + " * " + b + " = " + (a*b))
    }
  }
}

