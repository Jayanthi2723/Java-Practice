class Exception11{
  public static void main(String[] args) {
    int a=20;
    int b=-0;
    try{
      int c=a/b;
      System.out.print(c);
    }
    catch (ArithmeticException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
