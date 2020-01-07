package com.eomcs.lms.handler;

import java.util.Arrays;

public class ArrayList<클래스이름> {
  
  static final int DEFAULT_CAPACITY = 3;
  
  Object[] list;
  int size = 0;
  
  public ArrayList() {
    this.list = new Object[DEFAULT_CAPACITY];
  }
  
  public ArrayList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000)
      this.list = new Object[DEFAULT_CAPACITY];
    else 
      this.list = new Object[capacity];
  }

  public Object[] toArray() {
    return Arrays.copyOf(this.list, this.size);
  }

  public void add(클래스이름 obj) {
    if (this.size == this.list.length) {
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity);
    }
    this.list[this.size++] = obj;
  }
  
  public 클래스이름 get(int idx) {
    if (idx >= 0 && idx < this.size) {
      return (클래스이름)this.list[idx];
    } else {
      return null;
    }
  }
}










