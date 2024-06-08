class Exception2{//exception not occurs
  public static void main(String[] args) {
    int a=20;
    int b=2;
    try{
      int c=a/b;
      System.out.println(c);
    }
    catch (ArithmeticException e) {
      System.out.println("exception not occurs");
    }
  }
}
