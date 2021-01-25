import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object plusMinutesDemo {
    def main(args: Array[String]): Unit = {
        val dateTimeFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

        val begingDateTime: LocalDateTime = LocalDateTime.parse("2020-03-03 20:20:00".trim, dateTimeFormatter)
        println(begingDateTime)

        val tmpDateTime = begingDateTime.plusMinutes(1).toString
        println(tmpDateTime)
    }
}
