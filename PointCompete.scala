object pointcompete
{
    def main(args: Array[String])
    {
        var a= Array(5,6,20,35);
        var b= Array(10,6,15,44);
        var i=0;
        for(i <- 0 to 3)
        {
            if(a(i)!=b(i))
            {
                println("1");
            }
            else
            {
                print("");
            }
        }
    }
} 