package com.eomcs.util2;

import java.util.Arrays;

class Stack implements Cloneable {
  
  private static final int DEFAULT_CAPACITY = 10;
  
  Object[] elementData;
  int size;
  
  Stack() {
    this.elementData = new Object[DEFAULT_CAPACITY];
    this.size = 0;
  }
  
  void push(Object value) {
    if (this.elementData.length == size) {
      grow();
    }
    this.elementData[size++] = value;
  }
  
  Object pop() {
    if (this.empty()) {
      return null;
    } else {
      return this.elementData[--size];
    }
  }
  
  boolean empty() {
    return this.size == 0; 
  }
  
  private void grow() {
    this.elementData = Arrays.copyOf(elementData, newCapacity());
  }
  
  private int newCapacity() {
    int oldCapacity = this.elementData.length;
    return oldCapacity + (oldCapacity >> 1);
  }
  
  Stack clone() {
    try {
      return (Stack)super.clone();
    } catch (CloneNotSupportedException ex) {
      System.out.println(ex);
      return null;
    }
  }
}