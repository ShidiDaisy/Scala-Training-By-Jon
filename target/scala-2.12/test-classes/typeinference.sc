object typeinference {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val num = 5                                     //> num  : Int = 5
  val a = 3.5                                     //> a  : Double = 3.5
  val b = 3.5f                                    //> b  : Float = 3.5
  var x = 1+2*3.5                                 //> x  : Double = 8.0
  List(1, 2, 4.5)                                 //> res0: List[Double] = List(1.0, 2.0, 4.5)
  List(1, true)                                   //> res1: List[AnyVal] = List(1, true)
  List(1, true, "Peggy")                          //> res2: List[Any] = List(1, true, Peggy)
  
  def addOne(x:Int) = x + 1                       //> addOne: (x: Int)Int
  //automatically define a return type Int
  
  def function1(x:Int) = if(x>0) 1 else "negative"//> function1: (x: Int)Any
}