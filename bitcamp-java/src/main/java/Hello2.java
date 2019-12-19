public class Hello2 {
  public static void main(String[] args) {
    class ss{
      int a;
      String b;
      double c;
    }
    ss[] arr = new ss[100];
    
    System.out.println(arr[1]);
    
    arr[0] = new ss();
    arr[1] = new ss();
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    int[] aa = new int[3];
    
    aa[2] = 3;

  }
}