package syntax

object HelloWorld {
  /* : return type
   * Unit: void
   */
  def main(args:Array[String]):Unit = {
    println("Hello, world!")
    
    var firstName:String = "Peggy" //mutable
    val age:Int = 21 //immutable
    println(firstName + ", is \n" + age + " years old")
    var sum = 10 + 25
    
    def function1:Unit = {
      println("This is function1")
    }
    
    function1
  }
}