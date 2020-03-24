// @GENERATOR:play-routes-compiler
// @SOURCE:/tmp/scala-non-static-final-field-error/src/main/resources/hello.routes
// @DATE:Tue Mar 24 05:17:38 CET 2020

package hello

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HomeController_0: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HomeController_0: controllers.HomeController
  ) = this(errorHandler, HomeController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    hello.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """param1<.+>""", """controllers.HomeController.foo(param1:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """just-a-second-route""", """controllers.HomeController.bar()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_HomeController_foo0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("param1", """.+""",false)))
  )
  private[this] lazy val controllers_HomeController_foo0_invoker = createInvoker(
    HomeController_0.foo(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "hello",
      "controllers.HomeController",
      "foo",
      Seq(classOf[String]),
      "GET",
      this.prefix + """""" + "$" + """param1<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_HomeController_bar1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("just-a-second-route")))
  )
  private[this] lazy val controllers_HomeController_bar1_invoker = createInvoker(
    HomeController_0.bar(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "hello",
      "controllers.HomeController",
      "bar",
      Nil,
      "GET",
      this.prefix + """just-a-second-route""",
      """ Workaround by adding a second route""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_HomeController_foo0_route(params@_) =>
      call(params.fromPath[String]("param1", None)) { (param1) =>
        controllers_HomeController_foo0_invoker.call(HomeController_0.foo(param1))
      }
  
    // @LINE:4
    case controllers_HomeController_bar1_route(params@_) =>
      call { 
        controllers_HomeController_bar1_invoker.call(HomeController_0.bar())
      }
  }
}
