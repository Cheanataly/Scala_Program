object Demo
{
    def main(args: Array[String])
    {
        for(i<- 1 to 10)
        println("Addition of " + i + ": = " + Addition(i))
    }
    def Addition(n: Int): Int =
    {
        if(n==1)
        return 1
        else
        n + Addition(n-1)
    }
}
