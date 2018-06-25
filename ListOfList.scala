object Demo
{
  def main(args: Array[String])
  {
    var list1=List(12,34,55)
    var list2=List(24,54,75)
    var list3=List(34,75,24)
    var list=List(list1,list2,list3)
    println("List of lists : " + list)
    println("Convert list1 to a String : " + list1.mkString(" , "))
    println("Print all the elements of list except the last one : " + list.init)
  }
}

