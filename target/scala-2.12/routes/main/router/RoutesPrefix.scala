
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/playLabs2017-Lab1/conf/routes
// @DATE:Tue Oct 24 15:43:40 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
