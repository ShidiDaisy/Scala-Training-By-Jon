object OperatorExample {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var x = 3                                       //> x  : Int = 3
  var y = 9                                       //> y  : Int = 9
  
  var b1 = x&y                                    //> b1  : Int = 1
  var b2 = x|y                                    //> b2  : Int = 11
  var b3 = x^y                                    //> b3  : Int = 10
  
  var b4 = x<<2                                   //> b4  : Int = 12
  /*Left shift 2
  3 => 11
  left shift 2 => 1100
  1100 => 12
  */
  
  val nums = 1::3::5::Nil                         //> nums  : List[Int] = List(1, 3, 5)
  
}