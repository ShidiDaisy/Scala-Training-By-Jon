
//count
val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
donuts.count(_=="Plain Donut")

//filter
val fruits = Set("orange", "peach", "apple", "banana")
val x = fruits.filter(_.startsWith("a"))

//map
val states = Map(
  "AK" -> "Alaska",
  "AL" -> "Alabama",
  "AR" -> "Arizona"
)

//find
val plainDonut: Option[String] = donuts.find(donutName => donutName == "Plain Donut")

//indexWhere
val firstTen = (1 to 10).toList
firstTen.indexWhere(_==5)

//headOption
val a = "foo bar baz"
fruits.headOption
a.headOption

//min (in index)
val names = List("Al", "Christina", "Kim")
names.min

//max
names.max

//get: a function on Options (Some or None). It gets the obtained element if it exists
val y:Option[Int] = Some(42)
y.get

//apply: When define it on an object, can let you call the object as if the object itself was a function
//class can be constructed without "new" keyword
object Greet{
  def apply(name: String): String = {
    "Hello %s".format(name)
  }
}
Greet.apply("bob")
Greet("bob")

//forall: iterating over a Collection, and return true if for every x in the collection that f(x) is true
List(1,2,3,4,5).forall(x => x < 3)

//groupBy: group elements by its' first character
val dountsGroup: Map[Char, Seq[String]] = donuts.groupBy(_.charAt(0))

//foldLeft: takes an associative binary operator function as parameter and use it to collapse elements from the collections
//The order for traversing the elements in the collection is from left to right
val prices: Seq[Double] = Seq(1.5, 2.0, 2.5)
prices.foldLeft(1.0)(_+_)
donuts.foldLeft("Chocolate Donuts, ")((a, b) => a + b + ", ")

//foldRight: The order for traversing the elements in the collection is from right to left
donuts.foldRight("Chocolate Donuts")((a, b) => a + ", " + b)

//reduce: Unlike fold method, reduce does not allow you to specify an initial value
prices.reduce(_+_)

//partition: Split the Seq by the element types
val donutNameAndPrices: Seq[Any] = Seq("Plain Donut", 1.5, "Strawberry Donut", 2.0, "Glazed Donut", 2.5)
val namesAndPrices: (Seq[Any], Seq[Any]) = donutNameAndPrices.partition{
  case name: String => true
  case price: Double => false
}
namesAndPrices._1
namesAndPrices._2

//lift
//whenever a value of type Point is unquoted at runtime it will be automatically transformed into a case class constructor call
import scala.reflect.runtime.universe._
case class Point(x: Int, y: Int)
object Point{
  implicit val lift = Liftable[Point]{
    p => q"_root_.points.Point(${p.x}, ${p.y})"
  }
}

//zipWithIndex: Create a new collection consisting of the element and its corresponding index
val zippedDonutsWithIndex: Seq[(String, Int)] = donuts.zipWithIndex
zippedDonutsWithIndex.foreach{donutWithIndex =>
  println(s"Donut element = ${donutWithIndex._1} is at index = ${donutWithIndex._2}")
}

//zip
val donutPrices: Seq[Double] = Seq(1.5, 2.0, 2.5)
val zippedDonuts: Seq[(String, Double)] = donuts zip donutPrices
