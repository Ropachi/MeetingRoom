// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ito/IdeaProjects/play2_scala_会議室予約システム/conf/routes
// @DATE:Tue Aug 02 11:24:08 JST 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def show(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "show/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:16
    def delete(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete")
    }
  
    // @LINE:14
    def update(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:11
    def editB(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "editB")
    }
  
    // @LINE:10
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "edit")
    }
  
    // @LINE:8
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create")
    }
  
    // @LINE:17
    def deleteB(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deleteB")
    }
  
    // @LINE:13
    def edit2(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "edit2/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:7
    def add(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add")
    }
  
    // @LINE:1
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:19
    def delete2(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete2" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:20
    def remove(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "remove/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:3
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
