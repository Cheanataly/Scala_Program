object RangeDemo
{
  def main(args: Array[String])
  {
    var arr = Range(1,100)
    for( i <- arr)
    {
      if ( i % 15 ==0)
      {
        println("FooBar");
      }
      else if ( i % 5 == 0)
      {
        println("Bar");
      }
      else if ( i % 3 == 0)
      {
        println("Foo");
      }
      else
      {
        println(i)
      }
    }
  }
}

