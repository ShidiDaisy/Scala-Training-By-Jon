

object bankAccount extends App{
  var a1 = new BankAccount("Sam", 2000, "savings")
  var a2 = new BankAccount("Alice", 5000.20f, "checking")
  println(a1)
  println(a2)
  class BankAccount(val cName:String, var balance:Float, val accType:String){
    var accNum = bankAccount.newAccNum()
    override def toString = "Client Name: " + cName + "\nBalance: " + balance + "\nAccount Type: " + accType +
    "\nAccount Number: " + accNum +
     ("\n" + "="*20)
  }
  
  object bankAccount{
  var accNum = 5000
  def newAccNum() = {accNum += 1
    accNum  
  }
  }
}

