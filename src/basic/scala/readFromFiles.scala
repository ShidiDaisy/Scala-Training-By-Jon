
import io.Source._ //get all the package from Source pkg
object readFromFiles extends App{
  val fileName = "src/rainbow.txt" //!! include src folder
  for(line <- fromFile(fileName).getLines()){
    println(line)
    println(line.toUpperCase())
  }
  val poemLines = fromFile("src/poem.txt").getLines().toList
  poemLines.foreach(println)
}