object stripMarginDemo {
    def main(args: Array[String]): Unit = {
        // stripMargin：去掉每行开头的第一个字符，默认是|
        var str =
            """
              |SELECT *
              |FORM table_name
              |""".stripMargin

        print(str)
    }
}
