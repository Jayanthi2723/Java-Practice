class Exception3{//exception occurs handled
  public static void main(String[] args) {
    String s="sheela";
    try{
      char ch=s.charAt(9);
      System.out.println(ch);
    }
    catch (StringIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
      System.out.println("exception is handled");
    }
  }
}
