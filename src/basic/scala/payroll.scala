

object payroll extends App{
  var e1 = new Employee("Sam", "Paulson")
  var e2 = new Employee("Dorris", "Jones", salaried = 's')
  println(e1)
  println(e2)
}

class Employee(val fName:String, val lName:String, var salaried:Char = 'n'){
  def fullName:String = fName + " " + lName
  var employeeID = Employee.newEEID()
  override def toString = "Employee name: " + fullName + "\nEmployee ID: " + employeeID +
    (if(salaried == 'n') "\nHourly Employee" else "\nSalaried Employee") + 
    ("\n" + "="*20)
}

//singleton object is use for a SINGLE instance of a class
/*assign a new employeeID everytime we add a employee
 * Companion object, because it goes along with employee class*/
object Employee{
  var employeeID = 0
  def newEEID() = {employeeID += 1
    employeeID  
  }
}
