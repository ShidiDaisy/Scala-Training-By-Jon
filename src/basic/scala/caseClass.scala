

object caseClass extends App {
  val alice = Person("Alice", 25)
  val rabbit = Person("Bugs", 50)
  val duck = Person("Donald", 21)
  
  for(person <- List(alice, rabbit, duck)){
    person match{
      case Person("Alice", 25) => println("Hi Alice")
      case Person("Bugs", 50) => println("Hi Bugs")
      case Person("Donald", 21) => println("Hi Donald")
    }
  }
}

/*case class: It pre-appends val to all params, so all the params are consider immutable
 * Can be added into list...
 * Create instance without "new"
 * Can do pattern matching*/
case class Person(fName:String, age:Int)