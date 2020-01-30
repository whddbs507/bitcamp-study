package com.eomcs.exception.ex05.prac;

import java.sql.Date;

public class Board {
  int num;
  String title;
  String index;
  Date date;
  
  void setNum(int num) {
    this.num = num;
  }
  
  int getNum() {
    return this.num;
  }
  
  void setTitle(String title) {
    this.title = title;
  }
  
  String getTitle() {
    return this.title;
  }
  
  void setIndex(String index) {
    this.index = index;
  }
  
  String getIndex() {
    return this.index;
  }
  
  void setDate(Date date) {
    this.date = date;
  }
  
  Date getDate() {
    return this.date;
  }
  
}