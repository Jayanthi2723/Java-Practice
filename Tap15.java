public class Tap15{
  public static void main(String[] args){
    int[] a={3,5,8};
    a[1]=7;
    int[] b=a;
    System.out.println(a[0]+" "+a[1]+" "+a[2]);
    System.out.println(b[0]+" "+b[1]+" "+b[2]);
  }
}
