object functionExamples {
  //def fnName(parameters):return type = {...}
  /*return type is optional if the compiler can infer the return type based on the
  body of the code
  */
  def abs(x:Int) = { if(x < 0) -x else x  }       //> abs: (x: Int)Int
  abs(-5)                                         //> res0: Int = 5
  
  def fac(n:Int) = {
  	var r = 1
  	for(i <- 1 to n)
  		r = r * i
  		r //return
  }                                               //> fac: (n: Int)Int
  fac(5) //5*4*3*2*1                              //> res1: Int = 120
  
  //recusively function (compiler can not tell the return type)
  def facRec(n:Int):Int = { if(n<=0) 1 else n*facRec(n-1) }
                                                  //> facRec: (n: Int)Int
  facRec(5)                                       //> res2: Int = 120
  
  def printName(left:String="[", firstName:String, lastName:String, right:String="]"){
  	println(left + firstName + " " + lastName + right)
  }                                               //> printName: (left: String, firstName: String, lastName: String, right: String
                                                  //| )Unit
  printName(lastName = "Fisher", firstName = "Peggy")
                                                  //> [Peggy Fisher]
  
  def sum(args:Int*) = {
  	var result = 0
  	for(arg <- args) result += arg
  	result
  }                                               //> sum: (args: Int*)Int
  sum(1,2,3,4,5)                                  //> res3: Int = 15
}