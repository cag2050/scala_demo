object MatchCaseDemo2 {
    def main(args: Array[String]): Unit = {

        val computeLevelXShows = (content_level: Int) => {
            var level_x_shows = 0
            content_level match {
                case 1 => level_x_shows = 1
                case 2 =>
            }
        }

    }
}
