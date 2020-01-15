package com.eomcs.oop.ex10.b;

public interface Servlet {
  public abstract void init();
  public abstract void service();
  public abstract void destroy();
  public abstract String getServletInfo();
  public abstract String getServletConfig();
}
