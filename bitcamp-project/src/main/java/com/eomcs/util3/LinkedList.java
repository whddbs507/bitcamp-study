package com.eomcs.util3;

public class LinkedList {
  
  Node first;
  Node last;
  int size;
  
  static class Node {
    Object value;
    Node next;
  }
  
  void add(Object value) {
    Node newNode = new Node();
    newNode.value = value;
    
    if (first == null) {
      last = first = newNode;
    } else {
      last.next = newNode;
      last = newNode;
    }
    this.size++;
  }
  
  void add(int index, Object value) {
    if (index < 0 || index >= size) {
      return;
    } else {
      Node newNode = new Node();
      newNode.value = value;
      
      Node cursor = first;
      for (int i = 0; i < index - 1; i++) {
        cursor = cursor.next;
      }
      
      if (index == 0) {
        newNode.next = first;
        first = newNode;
      } else {
        newNode.next = cursor.next;
        cursor.next = newNode;
      }
      this.size++;
    }
  }
  
  Object get(int index) {
    if (index < 0 || size <= index) {
      return null;
    } else {
      Node cursor = first;
      for (int i = 0; i < index; i++) {
        cursor = cursor.next;
      }
      return cursor.value;
    }
  }
  
  Object remove(int index) {
    if (index < 0 || index >= size) {
      return null;
    }
    
    Node cursor = first;
    for (int i = 0; i < index - 1; i++) {
      cursor = cursor.next;
    }
    
    Node deletedNode = null;
    
    if (index == 0) {
      deletedNode = first;
      first = deletedNode.next;
    } else {
      deletedNode = cursor.next;
      cursor.next = deletedNode.next;
    }
    
    deletedNode.next = null;
    size--;
    
    return deletedNode.value;
  }
  
  Object set(int index, Object value) {
    if (index < 0 || index >= size) {
      return null;
    }
    Node cursor = first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    Object oldValue = cursor.value;
    cursor.value = value;
    
    return oldValue;
  }
  
  Object[] toArray() {
    Object[] arr = new Object[size];
    
    Node cursor = first;
    for (int i = 0; i < size; i++) {
      arr[i] = cursor.value;
      cursor = cursor.next;
    }
    
    return arr;
  }
}