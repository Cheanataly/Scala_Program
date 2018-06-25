object demo
{
  def main(args: Array[String])
  {
    var list1=List(25,17,12)
    var list2=List(44,2,6,77)
    var list=List.concat(list1,list2)
    var i=0;
    var j=6;
    var re=list1.:::(list2)
    println("reverse of the concat : " + (list.reverse))
    println("odd values of concat : ")
    for(i <- 0 until 7; if list(i)%2!=0)
    {
      println(list(i));
    }
  }
}

    

