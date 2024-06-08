public class Tap3{
  public static void main(String[] args){
    int a=5;
    int b=6;
    int c=a++ - b-- + ++a - --a;
    System.out.println(c);
  }
}
