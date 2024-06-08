public class MyClass {
    public static void main(String args[]) {
      //Object a=2;
      int a=2;
      long b=a;
      System.out.println(((Object)b).getClass().getSimpleName());
    }
}
