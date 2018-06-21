object Function
{
    def Student(Id:Int, Name:String, Batch:Int, Province:String) : Unit =
    {
        println ("Id: " + Id +"\n" + "Name: " + Name + "\n" + "Batch: " + Batch + "\n" + "Province: " + Province);
    }
    def main(args: Array[String])
    {
        Student(102,"Nataly",4,"Siem Reap")
    }
}