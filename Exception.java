public class Exception{//Exception occurs handled
  public static void main(String[] args){
    int a=20;
    int b=0;
    // int c=a/b;
    // System.out.println(c);
    try{
      int c=a/b;
      System.out.println(c);
    }
    catch(ArithmeticException e)
    {
      System.out.println("can't divide by zero");//Exception occurs handled
    }
  }
}
