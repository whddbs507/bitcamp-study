package com.eomcs.util2;

import java.util.Arrays;

public class ArrayListPrac {

  final int DEFAULT_CAPACITY = 5;
  Object[] elementData;
  int size;
  int i;

  ArrayListPrac() {
    this.elementData = new Object[DEFAULT_CAPACITY];
  }

  ArrayListPrac(int initialCapacity) {
    if (initialCapacity < DEFAULT_CAPACITY) {
      this.elementData = new Object[DEFAULT_CAPACITY];
    } else {
      this.elementData = new Object[initialCapacity];    
    }
  }
  
  void add(Object context) {
    this.elementData[i++] = context;
    size++;
    if (this.elementData.length == i) {
      int oldSize = this.elementData.length;
      int newSize = oldSize + (oldSize >> 1);
      this.elementData = Arrays.copyOf(this.elementData, newSize);
    }
  }
  
  Object get(int i) {
    if (0 < i && i < elementData.length + 1) {
      return this.elementData[i];
    } else {
      return null;
    }
  }
  
  Object set(int i, Object afterContext) {
    if (0 < i && i < elementData.length) {
      Object oldValue = this.elementData[i];
      this.elementData[i] = afterContext;
      return oldValue;
    } else {
      return null;
    }
  }
  
  Object remove(int i) {
    if (0 < i && i < elementData.length) {
      for (int x = i; x < elementData.length - 1; x++) {
        this.elementData[x] = this.elementData[x+1];
      }
    } else {
      return null;
    }
    size--;
    return elementData[i];
  }
  
  void print() {
    for (int j = 0; j < i; j++) {
      System.out.printf("%s\t",this.elementData[j]);
    }
    System.out.println();
  }
  
  int size() {
    return this.size;
  }
}