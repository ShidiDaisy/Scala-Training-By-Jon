
/*Write a simple program that scans a sub-tree of Scala files and counts how many lines in each file, summing up in each folder,
ignoring non-Scala files.
Then extend that by sorting by the largest file and the largest folder and showing the Top 10 of each.*/

import java.io.File
import scala.collection.mutable.Map

object ScanFiles {
  def main(args: Array[String]): Unit = {
    val root = new File(args.headOption.getOrElse(".")).getCanonicalFile
    val extension = ".scala"
    val files = getListOfFiles(root, extension)
    var fileLineMap: Map[File, Int] = Map()
    countLinesMap(root, fileLineMap)
  }

  def countLines(file: File): Int= {
    val src = io.Source.fromFile(file)
    try {
      return src.getLines().size
    }
    finally {
        src.close()
    }
    }

  def getListOfFiles(root: File, ext: String): Array[File]= {
    val fileList = root.listFiles
    val matchedFiles = fileList.filter{file =>
      file.getName.endsWith(ext)
    }
    matchedFiles ++ fileList.filter(_.isDirectory).flatMap(getListOfFiles(_, ext))
  }

  def countLinesMap(root: File, fileLineMap: Map[File, Int]): Map[File, Int] = {
    val fileList = root.listFiles()
    for(file <- fileList){
      if(file.isDirectory){
        countLinesMap(file, fileLineMap)
      }else{
        val lines = countLines(file)
        fileLineMap += (file -> lines)
      }
    }
  }

  final case class ScalaFile(
    folder: String,
    path: String,
    lineCount: Int
                            )

  final case class ScalaFolder(
    path: String,
    lineCount: Int
                              )

  final case class Summary(
    topFiles: List[ScalaFile],
    topFolders: List[ScalaFolder]
                          )
}
