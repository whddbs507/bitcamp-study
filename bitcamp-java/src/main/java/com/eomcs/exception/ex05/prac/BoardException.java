package com.eomcs.exception.ex05.prac;

public class BoardException extends Exception{
  public BoardException() {
    super();
  }
  public BoardException(String message) {
    super(message);
  }
  public BoardException(String message, Throwable cause) {
    super(message, cause);
  }
  public BoardException(Throwable cause) {
    super(cause);
  }
  protected BoardException(String message, Throwable cause,
      boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}