object Foobar
{
    def main(args: Array[String])
    {
        var num=0;
        for( num <- 1 to 100)
        {
            if(num%15==0)
            {
                println("Foobar")
            }
            else if(num%5==0)
            {
                println("bar")
            }
            else if(num%3==0)
            {
                println("Foo")
            }
            else
            {
                println(num)
            }
        }
    }
}