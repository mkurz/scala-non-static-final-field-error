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
   bytes = "\u0006\u0005\u0005]b\u0001\u0002\t\u0012\u0001QA\u0001b\b\u0001\u0003\u0006\u0004%\t\u0005\t\u0005\tS\u0001\u0011\t\u0011)A\u0005C!A!\u0006\u0001B\u0001B\u0003%1\u0006\u0003\u00052\u0001\t\u0015\r\u0011\"\u00013\u0011!\u0001\u0005A!A!\u0002\u0013\u0019\u0004\"B!\u0001\t\u0003\u0011\u0005\"B!\u0001\t\u0003A\u0005\"\u0002+\u0001\t\u0003)\u0006B\u0002-\u0001A\u0003%1\u0007C\u0003Z\u0001\u0011\u0005!\f\u0003\u0005h\u0001!\u0015\r\u0015\"\u0003i\u0011!q\b\u0001#b!\n\u0013y\bBCA\n\u0001!\u0015\r\u0015\"\u0003\u0002\u0016!I\u00111\u0004\u0001\t\u0006\u0004&Ia \u0005\b\u0003;\u0001A\u0011AA\u0010\u0005\u0019\u0011v.\u001e;fg*\t!#A\u0003iK2dwn\u0001\u0001\u0014\u0005\u0001)\u0002C\u0001\f\u001e\u001b\u00059\"B\u0001\r\u001a\u0003\u001d\u0011x.\u001e;j]\u001eT!AG\u000e\u0002\t\r|'/\u001a\u0006\u00029\u0005!\u0001\u000f\\1z\u0013\tqrCA\bHK:,'/\u0019;fIJ{W\u000f^3s\u00031)'O]8s\u0011\u0006tG\r\\3s+\u0005\t\u0003C\u0001\u0012(\u001b\u0005\u0019#B\u0001\u0013&\u0003\u0011AG\u000f\u001e9\u000b\u0005\u0019Z\u0012aA1qS&\u0011\u0001f\t\u0002\u0011\u0011R$\b/\u0012:s_JD\u0015M\u001c3mKJ\fQ\"\u001a:s_JD\u0015M\u001c3mKJ\u0004\u0013\u0001\u0005%p[\u0016\u001cuN\u001c;s_2dWM]01!\tas&D\u0001.\u0015\u0005q\u0013aC2p]R\u0014x\u000e\u001c7feNL!\u0001M\u0017\u0003\u001d!{W.Z\"p]R\u0014x\u000e\u001c7fe\u00061\u0001O]3gSb,\u0012a\r\t\u0003iur!!N\u001e\u0011\u0005YJT\"A\u001c\u000b\u0005a\u001a\u0012A\u0002\u001fs_>$hHC\u0001;\u0003\u0015\u00198-\u00197b\u0013\ta\u0014(\u0001\u0004Qe\u0016$WMZ\u0005\u0003}}\u0012aa\u0015;sS:<'B\u0001\u001f:\u0003\u001d\u0001(/\u001a4jq\u0002\na\u0001P5oSRtD\u0003B\"F\r\u001e\u0003\"\u0001\u0012\u0001\u000e\u0003EAQa\b\u0004A\u0002\u0005BQA\u000b\u0004A\u0002-BQ!\r\u0004A\u0002M\"2aQ%K\u0011\u0015yr\u00011\u0001\"\u0011\u0015Qs\u00011\u0001,Q\t9A\n\u0005\u0002N%6\taJ\u0003\u0002P!\u00061\u0011N\u001c6fGRT\u0011!U\u0001\u0006U\u00064\u0018\r_\u0005\u0003':\u0013a!\u00138kK\u000e$\u0018AC<ji\"\u0004&/\u001a4jqR\u00111I\u0016\u0005\u0006/\"\u0001\raM\u0001\nC\u0012$\u0007K]3gSb\fQ\u0002Z3gCVdG\u000f\u0015:fM&D\u0018!\u00043pGVlWM\u001c;bi&|g.F\u0001\\!\ra\u0016mY\u0007\u0002;*\u0011alX\u0001\nS6lW\u000f^1cY\u0016T!\u0001Y\u001d\u0002\u0015\r|G\u000e\\3di&|g.\u0003\u0002c;\n!A*[:u!\u0015!WmM\u001a4\u001b\u0005I\u0014B\u00014:\u0005\u0019!V\u000f\u001d7fg\u0005)3m\u001c8ue>dG.\u001a:t?\"{W.Z\"p]R\u0014x\u000e\u001c7fe~3wn\u001c\u0019`e>,H/Z\u000b\u0002SJ\u0019!\u000e]:\u0007\t-\u0004\u0001!\u001b\u0002\ryI,g-\u001b8f[\u0016tGOP\u0005\u0003[:\fQ!\u00199qYfT!a\\\f\u0002\u000bI{W\u000f^3\u0011\u0005\u0011\f\u0018B\u0001::\u0005\u0019\te.\u001f*fMB\u0011A\u000f \b\u0003knt!A\u001e>\u000f\u0005]LhB\u0001\u001cy\u0013\u0005a\u0012B\u0001\u000e\u001c\u0013\tA\u0012$\u0003\u0002p/%\u0011QP\u001c\u0002\u0010!\u0006\u0014\u0018-\\:FqR\u0014\u0018m\u0019;pe\u000693m\u001c8ue>dG.\u001a:t?\"{W.Z\"p]R\u0014x\u000e\u001c7fe~3wn\u001c\u0019`S:4xn[3s+\t\t\t\u0001E\u0003\u0017\u0003\u0007\t9!C\u0002\u0002\u0006]\u0011a\u0002S1oI2,'/\u00138w_.,'\u000f\u0005\u0003\u0002\n\u0005=QBAA\u0006\u0015\r\tiaG\u0001\u0004[Z\u001c\u0017\u0002BA\t\u0003\u0017\u0011aAU3tk2$\u0018!J2p]R\u0014x\u000e\u001c7feN|\u0006j\\7f\u0007>tGO]8mY\u0016\u0014xLY1sc}\u0013x.\u001e;f+\t\t9B\u0005\u0003\u0002\u001aA\u001ch!B6\u0001\u0001\u0005]\u0011aJ2p]R\u0014x\u000e\u001c7feN|\u0006j\\7f\u0007>tGO]8mY\u0016\u0014xLY1sc}KgN^8lKJ\faA]8vi\u0016\u001cXCAA\u0011!\u001d!\u00171EA\u0014\u0003cI1!!\n:\u0005=\u0001\u0016M\u001d;jC24UO\\2uS>t\u0007\u0003BA\u0015\u0003[i!!a\u000b\u000b\u0007\u00055Q%\u0003\u0003\u00020\u0005-\"!\u0004*fcV,7\u000f\u001e%fC\u0012,'\u000f\u0005\u0003\u0002*\u0005M\u0012\u0002BA\u001b\u0003W\u0011q\u0001S1oI2,'\u000f"
)
public class Routes extends GeneratedRouter {
   private ParamsExtractor hello$Routes$$controllers_HomeController_foo0_route;
   private HandlerInvoker<Result> hello$Routes$$controllers_HomeController_foo0_invoker;
   private ParamsExtractor hello$Routes$$controllers_HomeController_bar1_route;
   private HandlerInvoker<Result> hello$Routes$$controllers_HomeController_bar1_invoker;
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
      return (List)((LinearSeqOps)(new colon(new Tuple3("GET", (new StringBuilder(11)).append(this.prefix()).append(this.prefix().endsWith("/") ? "" : "/").append("$").append("param1<.+>").toString(), "controllers.HomeController.foo(param1:String)"), new colon(new Tuple3("GET", (new StringBuilder(19)).append(this.prefix()).append(this.prefix().endsWith("/") ? "" : "/").append("just-a-second-route").toString(), "controllers.HomeController.bar()"), new colon(scala.collection.immutable.Nil..MODULE$, scala.collection.immutable.Nil..MODULE$))))).foldLeft(scala.collection.immutable.List..MODULE$.empty(), (s, e) -> {
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

   private ParamsExtractor controllers_HomeController_bar1_route$lzycompute() {
      synchronized(this){}

      try {
         if ((byte)(this.bitmap$0 & 4) == 0) {
            this.hello$Routes$$controllers_HomeController_bar1_route = play.core.routing.Route..MODULE$.apply("GET", new PathPattern((Seq)(new colon(new StaticPart(this.prefix()), new colon(new StaticPart(this.defaultPrefix), new colon(new StaticPart("just-a-second-route"), scala.collection.immutable.Nil..MODULE$))))));
            this.bitmap$0 = (byte)(this.bitmap$0 | 4);
         }
      } catch (Throwable var3) {
         throw var3;
      }

      return this.hello$Routes$$controllers_HomeController_bar1_route;
   }

   public ParamsExtractor hello$Routes$$controllers_HomeController_bar1_route() {
      return (byte)(this.bitmap$0 & 4) == 0 ? this.controllers_HomeController_bar1_route$lzycompute() : this.hello$Routes$$controllers_HomeController_bar1_route;
   }

   private HandlerInvoker<Result> controllers_HomeController_bar1_invoker$lzycompute() {
      synchronized(this){}

      try {
         if ((byte)(this.bitmap$0 & 8) == 0) {
            this.hello$Routes$$controllers_HomeController_bar1_invoker = this.createInvoker(() -> {
               return this.hello$Routes$$HomeController_0.bar();
            }, new HandlerDef(this.getClass().getClassLoader(), "hello", "controllers.HomeController", "bar", scala.collection.immutable.Nil..MODULE$, "GET", (new StringBuilder(19)).append(this.prefix()).append("just-a-second-route").toString(), " Workaround by adding a second route", (Seq)scala.collection.immutable.Seq..MODULE$.apply(scala.collection.immutable.Nil..MODULE$)), play.core.routing.HandlerInvokerFactory..MODULE$.wrapJava());
            this.bitmap$0 = (byte)(this.bitmap$0 | 8);
         }
      } catch (Throwable var3) {
         throw var3;
      }

      return this.hello$Routes$$controllers_HomeController_bar1_invoker;
   }

   public HandlerInvoker<Result> hello$Routes$$controllers_HomeController_bar1_invoker() {
      return (byte)(this.bitmap$0 & 8) == 0 ? this.controllers_HomeController_bar1_invoker$lzycompute() : this.hello$Routes$$controllers_HomeController_bar1_invoker;
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

            if (x1 != null) {
               Option var7 = this.$outer.hello$Routes$$controllers_HomeController_bar1_route().unapply(x1);
               if (!var7.isEmpty()) {
                  var3 = this.$outer.call(() -> {
                     return this.$outer.hello$Routes$$controllers_HomeController_bar1_invoker().call(() -> {
                        return this.$outer.hello$Routes$$HomeController_0.bar();
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

            if (x1 != null) {
               Option var5 = this.$outer.hello$Routes$$controllers_HomeController_bar1_route().unapply(x1);
               if (!var5.isEmpty()) {
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
