object Demo
{
  def main(args: Array[String])
  {
    var fruit1="apples":: ("oranges"::("pears" :: Nil))
    var fruit2="mangoes"::("banana":: Nil)
    // use two or more lists with ::: operator
    var fruit=fruit1 ::: fruit2
    println("fruit1 ::: fruit2 : " + fruit)
    // use two lists with Set.:::() method
    fruit=fruit1.:::(fruit2)
    println("fruit1.:::(fruit2) : " + fruit)
    // pass two or more lists as arguments
    fruit = List.concat(fruit1, fruit2)
    println("List.concat(fruit1, fruit2) : " + fruit)
  }
}

