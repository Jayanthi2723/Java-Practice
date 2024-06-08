class Exception8{//exception occurs handled
  public static void main(String[] args) {
    int ar[]={4,6,7,3,8,2,8};
    try{
      System.out.println(ar[10]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("exception occurs handled");
    }
  }
}
