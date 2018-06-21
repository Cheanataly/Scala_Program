object Countdown
{
  def main(args: Array[String])
  {
    println("Input Number");
    var num=scala.io.StdIn.readInt()
    while(num!=0)
    {
      println(num);
      num=num-1;
    }
    println("Happy Birthday");
  }
}


