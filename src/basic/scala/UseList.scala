import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader

object UseList extends App {
  //construct a list
  val mainList = List(1, 2, 3, 4)
  val list1 = 1::2::3::4::Nil
  val list2 = 1::2::List(3,4)
  println(mainList)
  println(list1)
  println(list2)

}
