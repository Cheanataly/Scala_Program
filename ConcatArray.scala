object ConcatArray
{
  def main(args: Array[String])
  {
    var arr1 = new Array[Int](5)
    var arr2 = new Array[Int](5)
    println("Input number:")
    for(i <- 0 to arr1.length-1)
    {
      arr1(i)=scala.io.StdIn.readInt()
      arr2(i)=scala.io.StdIn.readInt()
    }
    var arr3 = new Array[Int](5)
    arr3 = Array.concat(arr1,arr2);
    println("Concatunate of arr1 and arr2 : ")
    for( i <- 0 to arr3.length-1)
    {
      println(arr3(i))
    }
  }
}

