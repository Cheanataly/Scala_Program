object SingleArray
{
  def main(args: Array[String])
  {
   // var array = Array(5, 10, 15, 20, 25)
    var arraynum = new Array[Int](5)
 //   var i = 0;
    var sum = 0;
    for (i <- 0 to arraynum.length-1)
    {
     // sum = sum + array(i)
        arraynum(i) = scala.io.StdIn.readInt()
    }
    for (i <- 0 to arraynum.length-1)
    {
       sum += arraynum(i)
    }
    println(sum)
  }
}

