package com.eomcs.util3;

class Queue extends LinkedList {
  
  void offer(Object value) {
    this.add(value);
  }
  
  Object poll() {
    return this.remove(0);
  }
}
