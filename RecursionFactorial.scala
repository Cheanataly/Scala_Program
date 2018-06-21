object Demo
{
    def main(args: Array[String])
    {
        for (i <- 1 to 10)
        println("Factorial of " + i + ": = "+ factorial(i))
    }
    def factorial(n: BigInt): BigInt = {
        if(n<=1)
        return 1
        else
        return ln * factorial(n-1)
    }
}