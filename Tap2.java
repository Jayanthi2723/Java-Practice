public class Tap2{
  public static void main(String[] args){
    int a=5;
    a=a++;
    a=++a;
    int b=a++ - ++a;
    System.out.println(a);
    System.out.println(b);
  }
}
