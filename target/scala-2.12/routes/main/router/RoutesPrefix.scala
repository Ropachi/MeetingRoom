// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ito/IdeaProjects/play2_scala_会議室予約システム/conf/routes
// @DATE:Tue Aug 02 11:24:08 JST 2022


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
