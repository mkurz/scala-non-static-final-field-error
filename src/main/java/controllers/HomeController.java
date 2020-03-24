package controllers;

import play.mvc.Result;
import play.mvc.Results;

public class HomeController {

  public Result foo(final String param1) {
    return Results.ok("foo");
  }
}
