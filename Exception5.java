class Exception5{//exception not occurs
  public static void main(String[] args) {
    String s="sheela";
    try{
      char ch=s.charAt(3);
      System.out.println(ch);
    }
    catch (StringIndexOutOfBoundsException e) {
      System.out.println("exception not occurs");
    }
  }
}
