package com.eomcs.algorithm.data_structure.array;

public class ArrayList {
  
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
  
  void add(Object Content) {
    if (size == elementData.length)
    {
      int oldCapacity = elementData.length;
      int newCapacity = elementData.length * 3/2;
      elementData = new Object[newCapacity];
    }
    elementData[size++] = Content;
  }
  
  Object get(int no) {
    return elementData[no];
  }
  
  void set(int no, Object obj) {
    elementData[no] = obj;
  }
  
  void remove(int no) {
    for (int i = no + 1; i <= this.size; i++) {
      this.elementData[i-1] = this.elementData[i];
    }
    this.size--;
  }
}