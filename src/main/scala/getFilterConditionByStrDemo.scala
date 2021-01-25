import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object getFilterConditionByStrDemo {
    /**
     * 拼接过滤条件,每次增加一分钟
     *
     * @param begingDateTime
     * @param endDateTime
     * @return
     */
    def getFilterConditionByStr(begingDateTime: LocalDateTime, endDateTime: LocalDateTime): String = {
        var startTime = LocalDateTime.parse(begingDateTime.toString).minusMinutes(1).toString
        val endTime = endDateTime.toString

        val days = startTime.substring(0, 10)
        val hours = startTime.substring(11, 13)
        val minutes = startTime.substring(14, 16)


        val daye = endTime.substring(0, 10)
        val houre = endTime.substring(11, 13)
        val minutee = endTime.substring(14, 16)

        val startConditionStr = days + hours + minutes
        val endConditionStr = daye + houre + minutee
        //val resultStr = s"concat(day,hour,minute) > '${startConditionStr}' and concat(day,hour,minute) < '${endConditionStr}'"
        val resultStr = s"(day = '${days}' or day > '${days}') and concat(day,hour,minute) > '${startConditionStr}' and concat(day,hour,minute) < '${endConditionStr}'"

        resultStr
    }

    def main(args: Array[String]): Unit = {
        val dateTimeFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        val begingDateTime: LocalDateTime = LocalDateTime.parse("2020-10-11 20:20:00".trim, dateTimeFormatter)
        println(getFilterConditionByStr(begingDateTime, begingDateTime))
    }
}
