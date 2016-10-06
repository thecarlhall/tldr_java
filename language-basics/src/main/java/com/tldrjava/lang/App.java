/*
 * LICENSE
 */
package com.tldrjava.lang;

import java.io.IOException;
import java.util.logging.Logger;

public class App {
  private static final String CONSTANT = "This is a constant string";
  public static final String NOT_SO_MUCH = "Yeah";

  private static final Logger log = Logger.getLogger(App.class.getName());

  private final double money;
  private final boolean makeMoney = true;

  private Boolean rock = Boolean.TRUE;
  private Double dbl = 1.0; // double => Double

  private int count = 10;
  private boolean fun;

  private String[] strings = new String[10];
  private String[] moreStrings = new String[] { "this", "then", "more" };
  private int[] ints = new int[] { 1, 2, 3, 4 };

  public App() {
    this.money = 5.0;

    java.util.Map<String, String> myMap = new java.util.HashMap<>();
    myMap.put("key", "val");
    String s = myMap.get("key");
  }

  public int getCount() {
    return count++;
  }

  public boolean isFun() {
    return fun;
  }

  public void setFun(boolean fun) {
    this.fun = fun;
  }

  public App fun(boolean fun) {
    this.fun = fun;
    return this;
  }

  /**
   * Main method to run App  {@link java.util.List}
   * @param args
   * @throws IOException
   */
    public static void main( String[] args ) throws IOException {
      System.out.println( "Hello World!" );

      App a = new App();
      System.out.println(a.getCount());
      a.getCount();
      a.setFun(false);
      a.fun(false).isFun();

      App lang = new App();
      lang.getCount();

      ((App) lang).isFun();

      App a2 = (App) lang;
    }
}
