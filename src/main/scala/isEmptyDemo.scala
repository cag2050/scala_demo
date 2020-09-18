object isEmptyDemo {
    def main(args: Array[String]): Unit = {
        val a: Option[Int] = Some(5)
        val b: Option[Int] = None
        // 使用 isEmpty() 方法来检测元组中的元素是否为 None
        println("a.isEmpty: " + a.isEmpty)
        println("b.isEmpty: " + b.isEmpty)
    }
}
