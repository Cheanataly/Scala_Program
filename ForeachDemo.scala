object ForeachDemo
{
  def main(args: Array[String])
  {
    var li = List(3,6,23,7)
    var sum:Int=0
    li.foreach(sum += _)
    println(sum)
  }
}

