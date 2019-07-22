object variables {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
    //variables
  var a = 10.toString()                           //> a  : String = 10
  
  //range
  var b = 10.to(20)                               //> b  : scala.collection.immutable.Range.Inclusive = Range 10 to 20
  var e = 10 to 20                                //> e  : scala.collection.immutable.Range.Inclusive = Range 10 to 20
  
  var c = 10 + 11                                 //> c  : Int = 21
  //infix notation
  var d = 10.+(11)                                //> d  : Int = 21
  
  var f = 97.toChar                               //> f  : Char = a
  var g = 85.97.toInt                             //> g  : Int = 85
  
  a+= " ten"
  println(a)                                      //> 10 ten
  
}