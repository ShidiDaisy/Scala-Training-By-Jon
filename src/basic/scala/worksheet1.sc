object worksheet1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var x = 5                                       //> x  : Int = 5
  var str = "Scala Rocks!"                        //> str  : String = Scala Rocks!
  var odds = List(1,3,5,7,9)                      //> odds  : List[Int] = List(1, 3, 5, 7, 9)
  2 to 10  //create a range                       //> res0: scala.collection.immutable.Range.Inclusive = Range 2 to 10
  
  var y =  true                                   //> y  : Boolean = true
  var pi = 3.14159                                //> pi  : Double = 3.14159
  def add(a:Int, b:Int):Int = a + b               //> add: (a: Int, b: Int)Int
  add(4,9)                                        //> res1: Int = 13
  
  def subtract(a:Int, b:Int):Int = a - b
  subtract(9,4)
  
  add(10,20)
  subtract(10,20)
}