package com.eomcs.algorithm.data_structure.array;

public class test {
  public static void main(String[] args) {
    ArrayList arrayList = new ArrayList(2);
    
    arrayList.add("가나다");
    arrayList.add(123);
    arrayList.add("abc");
    arrayList.add("가각간");
    
    System.out.println(arrayList.get(0));
    System.out.println(arrayList.get(1));
    System.out.println(arrayList.get(2));
    System.out.println(arrayList.get(3));
    System.out.println(arrayList.get(4));
    System.out.println(arrayList.get(5));
    System.out.println(arrayList.size);
    System.out.println("==============");
    
    arrayList.remove(1);
    
    System.out.println(arrayList.get(0));
    System.out.println(arrayList.get(1));
    System.out.println(arrayList.get(2));
    System.out.println(arrayList.get(3));
    System.out.println(arrayList.get(4));
    System.out.println(arrayList.get(5));
  }
}
