class Employee(val xc: Int, val yc: String)
{
    var x: Int = xc
    var y: String = yc
    println("Id: " + x + "\n" + "Name: " + y)
}
object Demo
{
    /* This is my first java program.
     *   This will print 'Hello World' as the output.
     *  This is an example of multi-line comments.
     */
    def main(args: Array[String])
    {
        val emp = new Employee(273,"Hallo")
        val emp1 = new Employee(374,"teahe")
        
    }
}