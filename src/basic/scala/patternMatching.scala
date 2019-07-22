

object patternMatching extends App{
  def greekAlphabet(letter:Char) = {
    //Switch
    letter match{
      case 'a' | 'A' => "Alpha"
      case 'b' | 'B' => "Beta"
      case _ => println("You entered an invalid character")
    }
  }
  println("The greek letter for A is: " + greekAlphabet('A'))
  
  def max(x:Int, y:Int) = x>y match{ //if x>y -> true
    case true => x
    case false => y
  }
  
  println(max(50,20))
}