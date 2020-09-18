object OptionSomeNoneDemo {
    def main(args: Array[String]) {

        val sites = Map("runoob" -> "www.runoob.com", "google" -> "www.google.com")

        println("sites.get( \"runoob\" ) : " +  sites.get( "runoob" )) // Some(www.runoob.com)
        println("sites.get( \"baidu\" ) : " +  sites.get( "baidu" ))  //  None
    }
}
