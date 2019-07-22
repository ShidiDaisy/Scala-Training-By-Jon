//Dictionary
object tupleExamples {
  val v = (1, 1.4, "Hello") //tuple can be any mixed types
                                                  //> v  : (Int, Double, String) = (1,1.4,Hello)
  val x = v._3                                    //> x  : String = Hello
  //._: access no.3 element, tuple's index starts from 1
  
  //assign to v
  val(first, second, third) = v                   //> first  : Int = 1
                                                  //| second  : Double = 1.4
                                                  //| third  : String = Hello
	//create a pair
	val symbols = Array("<", "-", ">")        //> symbols  : Array[String] = Array(<, -, >)
	val counts = Array(2,10,2)                //> counts  : Array[Int] = Array(2, 10, 2)
	val pairs = symbols.zip(counts)           //> pairs  : Array[(String, Int)] = Array((<,2), (-,10), (>,2))
	
	//2*< = <<
	for((s,n) <- pairs) print(s*n)            //> <<---------->>
	println                                   //> 
	/* if using print() instead of println(),
	need to add a println() to empty
	the buffer */
	
	//return Tuple2: gonna have 2 elems
	def divide10(n:Int):Tuple2[Int, Int] = {
		(n/10, n%10)
	}                                         //> divide10: (n: Int)(Int, Int)
	val(tens, ones) = divide10(99)            //> tens  : Int = 9
                                                  //| ones  : Int = 9
}