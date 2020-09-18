import scala.io.Source

object fromFileDemo {
    def main(args: Array[String]) {
        println("文件内容为:")

        Source.fromFile("test.txt").foreach {
            print
        }
    }
}
