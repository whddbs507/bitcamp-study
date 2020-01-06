package com.eomcs.oop.ex06.prac;

public class Exam {
  public static void main(String[] args) {
    Vehicle v = new Vehicle();
    Car c = new Car();
    Bike b = new Bike();
    Truck t = new Truck();
    Sedan s = new Sedan();
    
    Vehicle v2 = new Vehicle();
    v2.model = "aa";
    v2.capacity = 33;
    System.out.printf("%s\t",v2.model);
    System.out.printf("%d\n",v2.capacity);
    c.model = "dd";
    c.capacity = 3;
    c.cc = 50;
    c.value = 1;
    System.out.printf("%s\t",c.model);
    System.out.printf("%d\t",c.capacity);
    System.out.printf("%d\t",c.cc);
    System.out.printf("%d\n",c.value);
    v2 = c;
    System.out.printf("%s\t",c.model);
    System.out.printf("%d\t",c.capacity);
    System.out.printf("%d\t",c.cc);
    System.out.printf("%d\n",c.value);
    System.out.printf("%s\t",v2.model);
    System.out.printf("%d\t",v2.capacity);
    v2 = t;
    v2 = s;
    
    Car c2 = null;
    c2 = c;
  }
}
