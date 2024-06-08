class Exception4{//exception occurs not handled
  public static void main(String[] args) {
    String s="sheela";
    try{
      char ch=s.charAt(6);
      System.out.println(ch);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("exception occurs not handled");
    }
  }
}
