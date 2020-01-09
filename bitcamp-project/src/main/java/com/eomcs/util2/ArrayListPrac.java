package com.eomcs.util2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayListPrac<E> {

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

  void add(E context) {
    this.elementData[size++] = context;
    if (this.elementData.length == size) {
      int oldSize = this.elementData.length;
      int newSize = oldSize + (oldSize >> 1);
      this.elementData = Arrays.copyOf(this.elementData, newSize);
    }
  }
  

  @SuppressWarnings("unchecked")
  E get(int i) {
    if (0 < i && i < elementData.length + 1) {
      return (E)this.elementData[i];
    } else {
      return null;
    }
  }

  @SuppressWarnings("unchecked")
  E set(int i, E afterContext) {
    if (0 < i && i < elementData.length) {
      Object oldValue = this.elementData[i];
      this.elementData[i] = afterContext;
      return (E)oldValue;
    } else {
      return null;
    }
  }

  @SuppressWarnings("unchecked")
  E remove(int i) {
    if (0 < i && i < elementData.length) {
      E olds = (E)elementData[i];
      System.arraycopy(elementData, i + 1, 
          elementData, i, elementData.length - 2);
    } else {
      return null;
    }
    size--;
    return (E)elementData[i];
  }

  void print() {
    for (int j = 0; j < size; j++) {
      System.out.printf("%s\t",this.elementData[j]);
    }
    System.out.println();
  }

  int size() {
    return this.size;
  }
  
  @SuppressWarnings("unchecked")
  E[] toArray(E[] arr) {
    return (E[])Arrays.copyOf(elementData, size, arr.getClass());
  }
}