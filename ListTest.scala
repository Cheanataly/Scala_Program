object Demo
{
  def main(args: Array[String])
  {
    var fruit="apples":: ("oranges":: ("pears":: Nil))
    val nums=Nil
    println("Head of fruit : " + fruit.head)
    println("Tail of fruit : " + fruit.tail)
    println("Check if fruit is empty : " + fruit.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)
  }
}

