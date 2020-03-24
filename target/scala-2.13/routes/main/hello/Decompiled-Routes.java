package hello;

import controllers.HomeController;
import java.io.Serializable;
import javax.inject.Inject;
import play.api.http.HttpErrorHandler;
import play.api.mvc.Handler;
import play.api.mvc.RequestHeader;
import play.api.routing.HandlerDef;
import play.api.routing.Router.;
import play.core.routing.DynamicPart;
import play.core.routing.GeneratedRouter;
import play.core.routing.HandlerInvoker;
import play.core.routing.PathPattern;
import play.core.routing.RouteParams;
import play.core.routing.StaticPart;
import play.core.routing.Route.ParamsExtractor;
import play.mvc.Result;
import scala.Function1;
import scala.Option;
import scala.PartialFunction;
import scala.Tuple3;
import scala.collection.LinearSeqOps;
import scala.collection.immutable.List;
import scala.collection.immutable.Seq;
import scala.collection.immutable..colon.colon;
import scala.reflect.ScalaSignature;

@ScalaSignature(
   bytes = "\u0006\u0005\u0005%b\u0001\u0002\b\u0010\u0001IA\u0001\"\b\u0001\u0003\u0006\u0004%\tE\b\u0005\tO\u0001\u0011\t\u0011)A\u0005?!A\u0001\u0006\u0001B\u0001B\u0003%\u0011\u0006\u0003\u00050\u0001\t\u0015\r\u0011\"\u00011\u0011!q\u0004A!A!\u0002\u0013\t\u0004\"B \u0001\t\u0003\u0001\u0005\"B \u0001\t\u00031\u0005\"\u0002*\u0001\t\u0003\u0019\u0006B\u0002,\u0001A\u0003%\u0011\u0007C\u0003X\u0001\u0011\u0005\u0001\f\u0003\u0005f\u0001!\u0015\r\u0015\"\u0003g\u0011!a\b\u0001#b!\n\u0013i\bbBA\b\u0001\u0011\u0005\u0011\u0011\u0003\u0002\u0007%>,H/Z:\u000b\u0003A\tQ\u0001[3mY>\u001c\u0001a\u0005\u0002\u0001'A\u0011AcG\u0007\u0002+)\u0011acF\u0001\be>,H/\u001b8h\u0015\tA\u0012$\u0001\u0003d_J,'\"\u0001\u000e\u0002\tAd\u0017-_\u0005\u00039U\u0011qbR3oKJ\fG/\u001a3S_V$XM]\u0001\rKJ\u0014xN\u001d%b]\u0012dWM]\u000b\u0002?A\u0011\u0001%J\u0007\u0002C)\u0011!eI\u0001\u0005QR$\bO\u0003\u0002%3\u0005\u0019\u0011\r]5\n\u0005\u0019\n#\u0001\u0005%uiB,%O]8s\u0011\u0006tG\r\\3s\u00035)'O]8s\u0011\u0006tG\r\\3sA\u0005\u0001\u0002j\\7f\u0007>tGO]8mY\u0016\u0014x\f\r\t\u0003U5j\u0011a\u000b\u0006\u0002Y\u0005Y1m\u001c8ue>dG.\u001a:t\u0013\tq3F\u0001\bI_6,7i\u001c8ue>dG.\u001a:\u0002\rA\u0014XMZ5y+\u0005\t\u0004C\u0001\u001a<\u001d\t\u0019\u0014\b\u0005\u00025o5\tQG\u0003\u00027#\u00051AH]8pizR\u0011\u0001O\u0001\u0006g\u000e\fG.Y\u0005\u0003u]\na\u0001\u0015:fI\u00164\u0017B\u0001\u001f>\u0005\u0019\u0019FO]5oO*\u0011!hN\u0001\baJ,g-\u001b=!\u0003\u0019a\u0014N\\5u}Q!\u0011i\u0011#F!\t\u0011\u0005!D\u0001\u0010\u0011\u0015ib\u00011\u0001 \u0011\u0015Ac\u00011\u0001*\u0011\u0015yc\u00011\u00012)\r\tu\t\u0013\u0005\u0006;\u001d\u0001\ra\b\u0005\u0006Q\u001d\u0001\r!\u000b\u0015\u0003\u000f)\u0003\"a\u0013)\u000e\u00031S!!\u0014(\u0002\r%t'.Z2u\u0015\u0005y\u0015!\u00026bm\u0006D\u0018BA)M\u0005\u0019IeN[3di\u0006Qq/\u001b;i!J,g-\u001b=\u0015\u0005\u0005#\u0006\"B+\t\u0001\u0004\t\u0014!C1eIB\u0013XMZ5y\u00035!WMZ1vYR\u0004&/\u001a4jq\u0006iAm\\2v[\u0016tG/\u0019;j_:,\u0012!\u0017\t\u00045~\u000bW\"A.\u000b\u0005qk\u0016!C5n[V$\u0018M\u00197f\u0015\tqv'\u0001\u0006d_2dWm\u0019;j_:L!\u0001Y.\u0003\t1K7\u000f\u001e\t\u0006E\u000e\f\u0014'M\u0007\u0002o%\u0011Am\u000e\u0002\u0007)V\u0004H.Z\u001a\u0002K\r|g\u000e\u001e:pY2,'o]0I_6,7i\u001c8ue>dG.\u001a:`M>|\u0007g\u0018:pkR,W#A4\u0013\u0007!t\u0017O\u0002\u0003j\u0001\u00019'\u0001\u0004\u001fsK\u001aLg.Z7f]Rt\u0014BA6m\u0003\u0015\t\u0007\u000f\u001d7z\u0015\tiW#A\u0003S_V$X\r\u0005\u0002c_&\u0011\u0001o\u000e\u0002\u0007\u0003:L(+\u001a4\u0011\u0005IThBA:z\u001d\t!\bP\u0004\u0002vo:\u0011AG^\u0005\u00025%\u0011\u0001$G\u0005\u0003-]I!!\\\u000b\n\u0005md'a\u0004)be\u0006l7/\u0012=ue\u0006\u001cGo\u001c:\u0002O\r|g\u000e\u001e:pY2,'o]0I_6,7i\u001c8ue>dG.\u001a:`M>|\u0007gX5om>\\WM]\u000b\u0002}B!Ac`A\u0002\u0013\r\t\t!\u0006\u0002\u000f\u0011\u0006tG\r\\3s\u0013:4xn[3s!\u0011\t)!a\u0003\u000e\u0005\u0005\u001d!bAA\u00053\u0005\u0019QN^2\n\t\u00055\u0011q\u0001\u0002\u0007%\u0016\u001cX\u000f\u001c;\u0002\rI|W\u000f^3t+\t\t\u0019\u0002E\u0004c\u0003+\tI\"a\t\n\u0007\u0005]qGA\bQCJ$\u0018.\u00197Gk:\u001cG/[8o!\u0011\tY\"a\b\u000e\u0005\u0005u!bAA\u0005G%!\u0011\u0011EA\u000f\u00055\u0011V-];fgRDU-\u00193feB!\u00111DA\u0013\u0013\u0011\t9#!\b\u0003\u000f!\u000bg\u000e\u001a7fe\u0002"
)
public class Routes extends GeneratedRouter {
   private ParamsExtractor hello$Routes$$controllers_HomeController_foo0_route;
   private HandlerInvoker<Result> hello$Routes$$controllers_HomeController_foo0_invoker;
   private final HttpErrorHandler errorHandler;
   public final HomeController hello$Routes$$HomeController_0;
   private final String prefix;
   private final String defaultPrefix;
   private volatile byte bitmap$0;

   public HttpErrorHandler errorHandler() {
      return this.errorHandler;
   }

   public String prefix() {
      return this.prefix;
   }

   public Routes withPrefix(final String addPrefix) {
      String prefix = .MODULE$.concatPrefix(addPrefix, this.prefix());
      RoutesPrefix$.MODULE$.setPrefix(prefix);
      return new Routes(this.errorHandler(), this.hello$Routes$$HomeController_0, prefix);
   }

   public List<Tuple3<String, String, String>> documentation() {
      return (List)((LinearSeqOps)(new colon(new Tuple3("GET", (new StringBuilder(11)).append(this.prefix()).append(this.prefix().endsWith("/") ? "" : "/").append("$").append("param1<.+>").toString(), "controllers.HomeController.foo(param1:String)"), new colon(scala.collection.immutable.Nil..MODULE$, scala.collection.immutable.Nil..MODULE$)))).foldLeft(scala.collection.immutable.List..MODULE$.empty(), (s, e) -> {
         List var2;
         if (e instanceof Tuple3) {
            Tuple3 var4 = (Tuple3)e;
            var2 = (List)s.$colon$plus(var4);
         } else {
            var2 = (List)s.$plus$plus((List)e);
         }

         return var2;
      });
   }

   private ParamsExtractor controllers_HomeController_foo0_route$lzycompute() {
      synchronized(this){}

      try {
         if ((byte)(this.bitmap$0 & 1) == 0) {
            this.hello$Routes$$controllers_HomeController_foo0_route = play.core.routing.Route..MODULE$.apply("GET", new PathPattern((Seq)(new colon(new StaticPart(this.prefix()), new colon(new StaticPart(this.defaultPrefix), new colon(new DynamicPart("param1", ".+", false), scala.collection.immutable.Nil..MODULE$))))));
            this.bitmap$0 = (byte)(this.bitmap$0 | 1);
         }
      } catch (Throwable var3) {
         throw var3;
      }

      this.defaultPrefix = null;
      return this.hello$Routes$$controllers_HomeController_foo0_route;
   }

   public ParamsExtractor hello$Routes$$controllers_HomeController_foo0_route() {
      return (byte)(this.bitmap$0 & 1) == 0 ? this.controllers_HomeController_foo0_route$lzycompute() : this.hello$Routes$$controllers_HomeController_foo0_route;
   }

   private HandlerInvoker<Result> controllers_HomeController_foo0_invoker$lzycompute() {
      synchronized(this){}

      try {
         if ((byte)(this.bitmap$0 & 2) == 0) {
            this.hello$Routes$$controllers_HomeController_foo0_invoker = this.createInvoker(() -> {
               return this.hello$Routes$$HomeController_0.foo((String)this.fakeValue());
            }, new HandlerDef(this.getClass().getClassLoader(), "hello", "controllers.HomeController", "foo", (Seq)scala.collection.immutable.Seq..MODULE$.apply(scala.runtime.ScalaRunTime..MODULE$.wrapRefArray((Object[])(new Class[]{String.class}))), "GET", (new StringBuilder(11)).append(this.prefix()).append("$").append("param1<.+>").toString(), "", (Seq)scala.collection.immutable.Seq..MODULE$.apply(scala.collection.immutable.Nil..MODULE$)), play.core.routing.HandlerInvokerFactory..MODULE$.wrapJava());
            this.bitmap$0 = (byte)(this.bitmap$0 | 2);
         }
      } catch (Throwable var3) {
         throw var3;
      }

      return this.hello$Routes$$controllers_HomeController_foo0_invoker;
   }

   public HandlerInvoker<Result> hello$Routes$$controllers_HomeController_foo0_invoker() {
      return (byte)(this.bitmap$0 & 2) == 0 ? this.controllers_HomeController_foo0_invoker$lzycompute() : this.hello$Routes$$controllers_HomeController_foo0_invoker;
   }

   public PartialFunction<RequestHeader, Handler> routes() {
      return new Serializable(this) {
         private static final long serialVersionUID = 0L;

         public final <A1 extends RequestHeader, B1> B1 applyOrElse(final A1 x1, final Function1<A1, B1> default) {
            Object var3;
            if (x1 != null) {
               Option var5 = this.$outer.hello$Routes$$controllers_HomeController_foo0_route().unapply(x1);
               if (!var5.isEmpty()) {
                  RouteParams params = (RouteParams)var5.get();
                  var3 = this.$outer.call(params.fromPath("param1", scala.None..MODULE$, play.api.mvc.PathBindable.bindableString..MODULE$), (param1) -> {
                     return this.$outer.hello$Routes$$controllers_HomeController_foo0_invoker().call(() -> {
                        return this.$outer.hello$Routes$$HomeController_0.foo(param1);
                     });
                  });
                  return var3;
               }
            }

            var3 = var2.apply(x1);
            return var3;
         }

         public final boolean isDefinedAt(final RequestHeader x1) {
            boolean var2;
            if (x1 != null) {
               Option var4 = this.$outer.hello$Routes$$controllers_HomeController_foo0_route().unapply(x1);
               if (!var4.isEmpty()) {
                  var2 = true;
                  return var2;
               }
            }

            var2 = false;
            return var2;
         }

         public {
            if ($outer == null) {
               throw null;
            } else {
               this.$outer = $outer;
            }
         }
      };
   }

   public Routes(final HttpErrorHandler errorHandler, final HomeController HomeController_0, final String prefix) {
      this.errorHandler = errorHandler;
      this.hello$Routes$$HomeController_0 = HomeController_0;
      this.prefix = prefix;
      this.defaultPrefix = prefix.endsWith("/") ? "" : "/";
   }

   @Inject
   public Routes(final HttpErrorHandler errorHandler, final HomeController HomeController_0) {
      this(errorHandler, HomeController_0, "/");
   }
}
