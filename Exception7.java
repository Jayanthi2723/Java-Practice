class Exception7{//exception occurs not handled
  public static void main(String[] args) {
    int ar[]={2,4,7,9,0,5};
    try{
      System.out.println(ar[7]);
    }
    catch (StringIndexOutOfBoundsException e) {
      System.out.println("exception occurs");
    }
  }
}
