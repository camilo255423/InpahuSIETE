<<<<<<< HEAD
// @SOURCE:/home/camilo/Documents/InpahuGeneracionInformes/glassfish/ModuloInformes/conf/routes
// @HASH:88a42ac4e6440cd4e30deb770049c56d6a83eb5a
// @DATE:Fri Mar 28 10:07:42 COT 2014
=======
// @SOURCE:/home/camilo/Documents/InpahuGeneracionInformes/ModuloInformes/conf/routes
// @HASH:06dda837ab862330da4ebd9ab46fb165a9f469a9
// @DATE:Sun Mar 30 12:36:26 COT 2014
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:31
// @LINE:16
// @LINE:15
class ReverseInforme5 {
    

<<<<<<< HEAD
// @LINE:16
def excel(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe5/excel/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
}
                                                

// @LINE:28
=======
// @LINE:31
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
def informePrograma(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "informeprograma")
}
                                                

// @LINE:16
def pdf(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe5/pdf/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
}
                                                
<<<<<<< HEAD
=======

// @LINE:15
def excel(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe5/excel/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
}
                                                
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
    
}
                          

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:27
// @LINE:8
// @LINE:7
class ReverseInforme1 {
    

<<<<<<< HEAD
// @LINE:8
def excel(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe1/excel/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
=======
// @LINE:27
def informeProfesor(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "informeprofesor")
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
}
                                                

// @LINE:8
def pdf(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe1/pdf/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
}
                                                

<<<<<<< HEAD
// @LINE:24
def informeProfesor(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "informeprofesor")
=======
// @LINE:7
def excel(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe1/excel/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
}
                                                
    
}
                          

// @LINE:21
// @LINE:20
class ReverseAdmin {
    

// @LINE:20
def autocompleteLabel(term:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "autocompleteLabel" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("term", term)))))
}
                                                

// @LINE:21
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                                                
    
}
                          

// @LINE:30
// @LINE:14
// @LINE:13
class ReverseInforme4 {
    

// @LINE:14
<<<<<<< HEAD
def excel(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe4/excel/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
=======
def pdf(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe4/pdf/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
}
                                                

// @LINE:30
def informeFacultad(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "informefacultad")
}
                                                

<<<<<<< HEAD
// @LINE:15
def pdf(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe4/pdf/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
=======
// @LINE:13
def excel(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe4/excel/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
}
                                                
    
}
                          

// @LINE:32
// @LINE:18
// @LINE:17
class ReverseInforme6 {
    

// @LINE:32
def informeParticipantes(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "informeparticipantes")
}
                                                

// @LINE:18
<<<<<<< HEAD
=======
def pdf(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe6/pdf/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
}
                                                

// @LINE:17
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
def excel(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe6/excel/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
}
                                                

// @LINE:19
def pdf(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe6/pdf/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
}
                                                
    
}
                          

// @LINE:29
// @LINE:26
// @LINE:12
// @LINE:11
class ReverseInforme3 {
    

<<<<<<< HEAD
// @LINE:12
def excel(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe3/excel/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
}
                                                

// @LINE:13
def pdf(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe3/pdf/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
}
                                                

=======
// @LINE:29
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
// @LINE:26
def informeProfesor(): Call = {
   () match {
// @LINE:26
case () if true => Call("GET", _prefix + { _defaultPrefix } + "informe3")
                                                        
// @LINE:29
case () if true => Call("POST", _prefix + { _defaultPrefix } + "informefinal")
                                                        
   }
}
                                                
<<<<<<< HEAD
=======

// @LINE:12
def pdf(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe3/pdf/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
}
                                                

// @LINE:11
def excel(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe3/excel/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
}
                                                
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
    
}
                          

// @LINE:33
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:6
class ReverseApplication {
    

<<<<<<< HEAD
// @LINE:30
def cambioSemestre(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "cambiosemestre")
}
                                                

=======
// @LINE:33
def cambioSemestre(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "cambiosemestre")
}
                                                

// @LINE:23
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:24
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

<<<<<<< HEAD
// @LINE:7
def prueba(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "prueba")
=======
// @LINE:22
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
}
                                                
    
}
                          

// @LINE:28
// @LINE:25
// @LINE:10
// @LINE:9
class ReverseInforme2 {
    

<<<<<<< HEAD
// @LINE:10
def excel(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe2/excel/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
}
                                                

// @LINE:11
def pdf(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe2/pdf/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
}
                                                

=======
// @LINE:28
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
// @LINE:25
def informeProfesor(): Call = {
   () match {
// @LINE:25
case () if true => Call("GET", _prefix + { _defaultPrefix } + "informe2")
                                                        
// @LINE:28
case () if true => Call("POST", _prefix + { _defaultPrefix } + "heteroevaluacion")
                                                        
   }
}
                                                
<<<<<<< HEAD
=======

// @LINE:10
def pdf(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe2/pdf/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
}
                                                

// @LINE:9
def excel(documento:String, semestre:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "informe2/excel/" + implicitly[PathBindable[String]].unbind("documento", dynamicString(documento)) + "/" + implicitly[PathBindable[String]].unbind("semestre", dynamicString(semestre)))
}
                                                
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
    
}
                          
}
                  


// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:31
// @LINE:16
// @LINE:15
class ReverseInforme5 {
    

<<<<<<< HEAD
// @LINE:16
def excel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe5.excel",
   """
      function(documento,semestre) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "informe5/excel/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documento", encodeURIComponent(documento)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("semestre", encodeURIComponent(semestre))})
      }
   """
)
                        

// @LINE:28
=======
// @LINE:31
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
def informePrograma : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe5.informePrograma",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "informeprograma"})
      }
   """
)
                        

// @LINE:16
def pdf : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe5.pdf",
   """
      function(documento,semestre) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "informe5/pdf/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documento", encodeURIComponent(documento)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("semestre", encodeURIComponent(semestre))})
      }
   """
)
                        
<<<<<<< HEAD
=======

// @LINE:15
def excel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe5.excel",
   """
      function(documento,semestre) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "informe5/excel/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documento", encodeURIComponent(documento)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("semestre", encodeURIComponent(semestre))})
      }
   """
)
                        
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
    
}
              

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:27
// @LINE:8
// @LINE:7
class ReverseInforme1 {
    

<<<<<<< HEAD
// @LINE:8
def excel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe1.excel",
=======
// @LINE:27
def informeProfesor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe1.informeProfesor",
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
   """
      function(documento,semestre) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "informe1/excel/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documento", encodeURIComponent(documento)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("semestre", encodeURIComponent(semestre))})
      }
   """
)
                        

// @LINE:8
def pdf : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe1.pdf",
   """
      function(documento,semestre) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "informe1/pdf/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documento", encodeURIComponent(documento)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("semestre", encodeURIComponent(semestre))})
      }
   """
)
                        

<<<<<<< HEAD
// @LINE:24
def informeProfesor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe1.informeProfesor",
=======
// @LINE:7
def excel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe1.excel",
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "informeprofesor"})
      }
   """
)
                        
    
}
              

// @LINE:21
// @LINE:20
class ReverseAdmin {
    

// @LINE:20
def autocompleteLabel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.autocompleteLabel",
   """
      function(term) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "autocompleteLabel" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("term", term)])})
      }
   """
)
                        

// @LINE:21
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        
    
}
              

// @LINE:30
// @LINE:14
// @LINE:13
class ReverseInforme4 {
    

// @LINE:14
<<<<<<< HEAD
def excel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe4.excel",
=======
def pdf : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe4.pdf",
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
   """
      function(documento,semestre) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "informe4/excel/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documento", encodeURIComponent(documento)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("semestre", encodeURIComponent(semestre))})
      }
   """
)
                        

// @LINE:30
def informeFacultad : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe4.informeFacultad",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "informefacultad"})
      }
   """
)
                        

<<<<<<< HEAD
// @LINE:15
def pdf : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe4.pdf",
=======
// @LINE:13
def excel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe4.excel",
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
   """
      function(documento,semestre) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "informe4/pdf/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documento", encodeURIComponent(documento)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("semestre", encodeURIComponent(semestre))})
      }
   """
)
                        
    
}
              

// @LINE:32
// @LINE:18
// @LINE:17
class ReverseInforme6 {
    

// @LINE:32
def informeParticipantes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe6.informeParticipantes",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "informeparticipantes"})
      }
   """
)
                        

// @LINE:18
<<<<<<< HEAD
def excel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe6.excel",
=======
def pdf : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe6.pdf",
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
   """
      function(documento,semestre) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "informe6/excel/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documento", encodeURIComponent(documento)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("semestre", encodeURIComponent(semestre))})
      }
   """
)
                        

<<<<<<< HEAD
// @LINE:19
def pdf : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe6.pdf",
=======
// @LINE:17
def excel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe6.excel",
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
   """
      function(documento,semestre) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "informe6/pdf/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documento", encodeURIComponent(documento)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("semestre", encodeURIComponent(semestre))})
      }
   """
)
                        
    
}
              

// @LINE:29
// @LINE:26
// @LINE:12
// @LINE:11
class ReverseInforme3 {
    

<<<<<<< HEAD
// @LINE:12
def excel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe3.excel",
=======
// @LINE:29
// @LINE:26
def informeProfesor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe3.informeProfesor",
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
   """
      function(documento,semestre) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "informe3/excel/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documento", encodeURIComponent(documento)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("semestre", encodeURIComponent(semestre))})
      }
   """
)
                        

// @LINE:12
def pdf : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe3.pdf",
   """
      function(documento,semestre) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "informe3/pdf/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documento", encodeURIComponent(documento)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("semestre", encodeURIComponent(semestre))})
      }
   """
)
                        

<<<<<<< HEAD
// @LINE:26
// @LINE:23
def informeProfesor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe3.informeProfesor",
=======
// @LINE:11
def excel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe3.excel",
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "informe3"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "informefinal"})
      }
      }
   """
)
                        
    
}
              

// @LINE:33
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:6
class ReverseApplication {
    

<<<<<<< HEAD
// @LINE:30
=======
// @LINE:33
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
def cambioSemestre : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.cambioSemestre",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cambiosemestre"})
      }
   """
)
                        

<<<<<<< HEAD
// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
=======
// @LINE:23
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
      }
   """
)
                        

// @LINE:24
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:22
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:28
// @LINE:25
// @LINE:10
// @LINE:9
class ReverseInforme2 {
    

<<<<<<< HEAD
// @LINE:10
def excel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe2.excel",
=======
// @LINE:28
// @LINE:25
def informeProfesor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe2.informeProfesor",
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
   """
      function(documento,semestre) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "informe2/excel/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documento", encodeURIComponent(documento)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("semestre", encodeURIComponent(semestre))})
      }
   """
)
                        

// @LINE:10
def pdf : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe2.pdf",
   """
      function(documento,semestre) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "informe2/pdf/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documento", encodeURIComponent(documento)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("semestre", encodeURIComponent(semestre))})
      }
   """
)
                        

<<<<<<< HEAD
// @LINE:25
// @LINE:22
def informeProfesor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe2.informeProfesor",
=======
// @LINE:9
def excel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Informe2.excel",
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "informe2"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "heteroevaluacion"})
      }
      }
   """
)
                        
    
}
              
}
        


// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

<<<<<<< HEAD
// @LINE:28
// @LINE:17
=======

// @LINE:31
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
// @LINE:16
// @LINE:15
class ReverseInforme5 {
    

<<<<<<< HEAD
// @LINE:16
def excel(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe5.excel(documento, semestre), HandlerDef(this, "controllers.Informe5", "excel", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe5/excel/$documento<[^/]+>/$semestre<[^/]+>""")
)
                      

// @LINE:28
=======
// @LINE:31
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
def informePrograma(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe5.informePrograma(), HandlerDef(this, "controllers.Informe5", "informePrograma", Seq(), "POST", """""", _prefix + """informeprograma""")
)
                      

// @LINE:16
def pdf(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe5.pdf(documento, semestre), HandlerDef(this, "controllers.Informe5", "pdf", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe5/pdf/$documento<[^/]+>/$semestre<[^/]+>""")
)
                      
<<<<<<< HEAD
=======

// @LINE:15
def excel(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe5.excel(documento, semestre), HandlerDef(this, "controllers.Informe5", "excel", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe5/excel/$documento<[^/]+>/$semestre<[^/]+>""")
)
                      
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
    
}
                          

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:27
// @LINE:8
// @LINE:7
class ReverseInforme1 {
    

<<<<<<< HEAD
// @LINE:8
def excel(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe1.excel(documento, semestre), HandlerDef(this, "controllers.Informe1", "excel", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe1/excel/$documento<[^/]+>/$semestre<[^/]+>""")
=======
// @LINE:27
def informeProfesor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe1.informeProfesor(), HandlerDef(this, "controllers.Informe1", "informeProfesor", Seq(), "POST", """""", _prefix + """informeprofesor""")
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
)
                      

// @LINE:8
def pdf(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe1.pdf(documento, semestre), HandlerDef(this, "controllers.Informe1", "pdf", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe1/pdf/$documento<[^/]+>/$semestre<[^/]+>""")
)
                      

<<<<<<< HEAD
// @LINE:24
def informeProfesor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe1.informeProfesor(), HandlerDef(this, "controllers.Informe1", "informeProfesor", Seq(), "POST", """""", _prefix + """informeprofesor""")
=======
// @LINE:7
def excel(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe1.excel(documento, semestre), HandlerDef(this, "controllers.Informe1", "excel", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe1/excel/$documento<[^/]+>/$semestre<[^/]+>""")
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
)
                      
    
}
                          

// @LINE:21
// @LINE:20
class ReverseAdmin {
    

// @LINE:20
def autocompleteLabel(term:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.autocompleteLabel(term), HandlerDef(this, "controllers.Admin", "autocompleteLabel", Seq(classOf[String]), "GET", """""", _prefix + """autocompleteLabel""")
)
                      

// @LINE:21
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.index(), HandlerDef(this, "controllers.Admin", "index", Seq(), "GET", """""", _prefix + """admin""")
)
                      
    
}
                          

// @LINE:30
// @LINE:14
// @LINE:13
class ReverseInforme4 {
    

// @LINE:14
<<<<<<< HEAD
def excel(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe4.excel(documento, semestre), HandlerDef(this, "controllers.Informe4", "excel", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe4/excel/$documento<[^/]+>/$semestre<[^/]+>""")
=======
def pdf(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe4.pdf(documento, semestre), HandlerDef(this, "controllers.Informe4", "pdf", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe4/pdf/$documento<[^/]+>/$semestre<[^/]+>""")
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
)
                      

// @LINE:30
def informeFacultad(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe4.informeFacultad(), HandlerDef(this, "controllers.Informe4", "informeFacultad", Seq(), "POST", """""", _prefix + """informefacultad""")
)
                      

<<<<<<< HEAD
// @LINE:15
def pdf(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe4.pdf(documento, semestre), HandlerDef(this, "controllers.Informe4", "pdf", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe4/pdf/$documento<[^/]+>/$semestre<[^/]+>""")
=======
// @LINE:13
def excel(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe4.excel(documento, semestre), HandlerDef(this, "controllers.Informe4", "excel", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe4/excel/$documento<[^/]+>/$semestre<[^/]+>""")
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
)
                      
    
}
                          

// @LINE:32
// @LINE:18
// @LINE:17
class ReverseInforme6 {
    

// @LINE:32
def informeParticipantes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe6.informeParticipantes(), HandlerDef(this, "controllers.Informe6", "informeParticipantes", Seq(), "POST", """""", _prefix + """informeparticipantes""")
)
                      

// @LINE:18
<<<<<<< HEAD
=======
def pdf(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe6.pdf(documento, semestre), HandlerDef(this, "controllers.Informe6", "pdf", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe6/pdf/$documento<[^/]+>/$semestre<[^/]+>""")
)
                      

// @LINE:17
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
def excel(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe6.excel(documento, semestre), HandlerDef(this, "controllers.Informe6", "excel", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe6/excel/$documento<[^/]+>/$semestre<[^/]+>""")
)
                      

// @LINE:19
def pdf(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe6.pdf(documento, semestre), HandlerDef(this, "controllers.Informe6", "pdf", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe6/pdf/$documento<[^/]+>/$semestre<[^/]+>""")
)
                      
    
}
                          

// @LINE:29
// @LINE:26
// @LINE:12
// @LINE:11
class ReverseInforme3 {
    

<<<<<<< HEAD
// @LINE:12
def excel(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe3.excel(documento, semestre), HandlerDef(this, "controllers.Informe3", "excel", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe3/excel/$documento<[^/]+>/$semestre<[^/]+>""")
=======
// @LINE:26
def informeProfesor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe3.informeProfesor(), HandlerDef(this, "controllers.Informe3", "informeProfesor", Seq(), "GET", """""", _prefix + """informe3""")
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
)
                      

// @LINE:12
def pdf(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe3.pdf(documento, semestre), HandlerDef(this, "controllers.Informe3", "pdf", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe3/pdf/$documento<[^/]+>/$semestre<[^/]+>""")
)
                      

<<<<<<< HEAD
// @LINE:23
def informeProfesor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe3.informeProfesor(), HandlerDef(this, "controllers.Informe3", "informeProfesor", Seq(), "GET", """""", _prefix + """informe3""")
=======
// @LINE:11
def excel(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe3.excel(documento, semestre), HandlerDef(this, "controllers.Informe3", "excel", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe3/excel/$documento<[^/]+>/$semestre<[^/]+>""")
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
)
                      
    
}
                          

// @LINE:33
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:6
class ReverseApplication {
    

<<<<<<< HEAD
// @LINE:30
def cambioSemestre(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.cambioSemestre(), HandlerDef(this, "controllers.Application", "cambioSemestre", Seq(), "POST", """""", _prefix + """cambiosemestre""")
)
                      

=======
// @LINE:33
def cambioSemestre(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.cambioSemestre(), HandlerDef(this, "controllers.Application", "cambioSemestre", Seq(), "POST", """""", _prefix + """cambiosemestre""")
)
                      

// @LINE:23
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:24
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

<<<<<<< HEAD
// @LINE:7
def prueba(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.prueba(), HandlerDef(this, "controllers.Application", "prueba", Seq(), "GET", """""", _prefix + """prueba""")
=======
// @LINE:22
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
)
                      
    
}
                          

// @LINE:28
// @LINE:25
// @LINE:10
// @LINE:9
class ReverseInforme2 {
    

<<<<<<< HEAD
// @LINE:10
def excel(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe2.excel(documento, semestre), HandlerDef(this, "controllers.Informe2", "excel", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe2/excel/$documento<[^/]+>/$semestre<[^/]+>""")
=======
// @LINE:25
def informeProfesor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe2.informeProfesor(), HandlerDef(this, "controllers.Informe2", "informeProfesor", Seq(), "GET", """""", _prefix + """informe2""")
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
)
                      

// @LINE:10
def pdf(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe2.pdf(documento, semestre), HandlerDef(this, "controllers.Informe2", "pdf", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe2/pdf/$documento<[^/]+>/$semestre<[^/]+>""")
)
                      

<<<<<<< HEAD
// @LINE:22
def informeProfesor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe2.informeProfesor(), HandlerDef(this, "controllers.Informe2", "informeProfesor", Seq(), "GET", """""", _prefix + """informe2""")
=======
// @LINE:9
def excel(documento:String, semestre:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Informe2.excel(documento, semestre), HandlerDef(this, "controllers.Informe2", "excel", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """informe2/excel/$documento<[^/]+>/$semestre<[^/]+>""")
>>>>>>> cb77d0927cd8f261a2ae957c054b26b84cb8d3a1
)
                      
    
}
                          
}
                  
      
