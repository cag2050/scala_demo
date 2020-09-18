object RegexDemo {
    def main(args: Array[String]) {
        // 使用 String 类的 r() 方法构造了一个Regex对象
        val pattern = "Scala".r
        val str = "Scala is Scalable and cool"

        println(pattern findFirstIn str)
        println((pattern findAllIn  str).mkString(","))
    }
}
