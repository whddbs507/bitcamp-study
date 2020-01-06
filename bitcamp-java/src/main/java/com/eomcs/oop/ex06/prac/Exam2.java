package com.eomcs.oop.ex06.prac;

public class Exam2 {
  
  static void printSedan(Sedan car) {
    System.out.printf("model : %s, cc : %d\n", car.model, car.cc);
  }
  
  static void printTruck(Truck car) {
    System.out.printf("value : %d, ton : %f\n", car.value, car.ton);
  }
  
  static void printCar(Car car) {
    System.out.printf("model : %s, cc : %d\n", car.model, car.cc);
    System.out.printf("value : %d", car.value);
  }

  public static void main(String[] args) {
    Sedan car1 = new Sedan();
    car1.model = "티코";
    car1.cc = 30;
    Truck car2 = new Truck();
    car2.value = 50;
    car2.ton = 2;
    
    printSedan(car1);
    printTruck(car2);
    printCar(car1);
    printCar(car2);
  }  
}