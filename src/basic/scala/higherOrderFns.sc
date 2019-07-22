object higherOrderFns {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val double = (i:Int) => i * 2                   //> double  : Int => Int = higherOrderFns$$$Lambda$8/1513712028@2752f6e2
  
  //parameter y is a function
  def higherOrder(x:Int, y:Int=>Int) = y(x)       //> higherOrder: (x: Int, y: Int => Int)Int
  
  higherOrder(6, double)                          //> res0: Int = 12
  
  val triple = (i:Int) => i*3                     //> triple  : Int => Int = higherOrderFns$$$Lambda$9/240650537@1cd072a9
  higherOrder(6, triple)                          //> res1: Int = 18
  
  def sayHello = (name:String) => {"Hello" + " " + name}
                                                  //> sayHello: => String => String
  var message = sayHello("Peggy")                 //> message  : String = Hello Peggy
  
  var y = 5                                       //> y  : Int = 5
  val multiplier = (x:Int)=> x * y                //> multiplier  : Int => Int = higherOrderFns$$$Lambda$11/1435804085@6a5fc7f7
  multiplier(10)                                  //> res2: Int = 50
}