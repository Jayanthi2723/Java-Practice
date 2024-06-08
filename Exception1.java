class Exception1{//exception occurs not handled
  public static void main(String[] args) {
    int a=20;
    int b=0;
    try{
      int c=a/b;
      System.out.println(c);
    }
    catch (NullPointerException e) {
      System.out.println("object type address and variable type address are no same");
    }
  }
}
