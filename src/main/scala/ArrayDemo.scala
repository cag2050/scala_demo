object ArrayDemo {
    def main(args: Array[String]): Unit = {
        val first_city_regions = Array(110000, 310000, 440100, 440300, 370100, 340200, 120000, 810000)
        println(first_city_regions.contains(110000))
        println(!first_city_regions.contains(110000222))
    }
}
