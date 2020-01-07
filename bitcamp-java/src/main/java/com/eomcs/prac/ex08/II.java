package com.eomcs.prac.ex08;

public class II extends Object {
  private int a;
  private int b;
  
  public int getA() {       // getter
    return a;
  }
  
  public void setA(int a) {     // setter
    this.a = a;
  }
  
  public int getB() {       // getter
    return b;
  }
  
  public void setB(int b) {     // setter
    this.b = b;
  }
  // getter / setter 를 통칭하여 'property(프로퍼티)'라 부른다.
}

class TestII {
  public static void main(String[] args) {
    II obj = new II();
    // obj.a = 100;
    // obj.b = 100;
    
    obj.setA(100);
    obj.setB(100);
    
    System.out.println(obj.getA());
    System.out.println(obj.getB());
  }
}