package com.eomcs.corelib.ex01;

public class Exam0173 {
  
  static class Engine implements Cloneable{
    int cc;
    int valve;
    
    Engine(int aa, int bb) {
      this.cc = aa;
      this.valve = bb;
    }
    
    @Override
    public Engine clone() throws CloneNotSupportedException {
      return (Engine)super.clone();
    }
    
    @Override
    public String toString() {
      return this.cc + ", " + this.valve;
    }
  }
  
  static class Car implements Cloneable {
    String maker;
    String name;
    Engine engine;
    Car(String xx, String yy, Engine ee) {
      this.maker = xx;
      this.name = yy;
      this.engine = ee;
    }
    
    @Override
    public Car clone() throws CloneNotSupportedException {
      Car carCopy = (Car)super.clone();
      carCopy.engine = this.engine.clone();
      return carCopy;
    }
    

    @Override
    public String toString() {
      return this.maker + ", " +this.name + ", " +this.engine;
    }
  }
  
  public static void main(String[] args) throws Exception {
    Engine engine = new Engine(3000, 16);
    Car car = new Car("비트자동차", "비트비트", engine);
    Car car2 = car.clone();
    
    System.out.println(car == car2);
    System.out.println(car);
    System.out.println(car2);
    System.out.println(car.engine == car2.engine);
    car.engine.cc = 2000;
    System.out.println(car2.engine.cc);
    car2.engine.cc = 2000;
    System.out.println(car2.engine.cc);
  }
}
