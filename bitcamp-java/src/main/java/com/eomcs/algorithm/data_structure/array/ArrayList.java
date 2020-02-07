package com.eomcs.algorithm.data_structure.array;

import java.util.Arrays;

public class ArrayList<E> {
  
  final int DEFAULT_CAPACITY = 2;
  int capacity;
  Object[] elementData;
  int size = 0;
  
  ArrayList() {
    elementData = new Object[DEFAULT_CAPACITY];
  }
  
  ArrayList(int initialCapacity) {
    if (DEFAULT_CAPACITY > initialCapacity) {
      elementData = new Object[DEFAULT_CAPACITY];
    } else {
      elementData = new Object[initialCapacity];
    }
  }
  
  void add(E Content) {
    if (size == elementData.length)
    {
      int oldCapacity = elementData.length;
      int newCapacity = elementData.length * 3/2;
      this.elementData = Arrays.copyOf(elementData, newCapacity);
    }
    elementData[size++] = Content;
  }
  
  E get(int no) {
    if (0 <= no && no < size) {
      return elementData[no];
    } else {
      return null;
    }
  }
  
  E set(int no, E obj) {
    if (0 <= no && no < size) {
      Object origin = obj;
      elementData[no] = obj;
      return origin;
    } else {
      return null;
    }
  }
  
  E remove(int no) {
    E origin = (E) elementData[no];
    if (0 <= no && no < size) {
      System.arraycopy(this.elementData, no + 1, this.elementData, 
      no, this.size - (no + 1));
      this.elementData[this.size - 1] = null;
      this.size--;
      return origin;
    } else {
      return null;
    }
  }
  
  int size() {
    return this.size;
  }
  
  E[] toArray() {
    return (E[]) Arrays.copyOf(elementData, this.size);
  }
}