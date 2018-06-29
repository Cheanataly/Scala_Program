object Demo
{
  def main(args: Array[String])
  {
    var ListName=List("Alex","Aloha", "Hola", "Bob");
    for (name <- ListName if name.startsWith("A"))
    {
      println(name)
    }
    for (name <- ListName)
    {
      if(name.length==4)
      {
      println("Yes");
      }
      else
      {
      println("No")
      }
    }
  }
}






