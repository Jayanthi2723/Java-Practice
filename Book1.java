class Book1{
  String title;
  int noOfPages;
  {
    System.out.println("NSB-1");
  }
  static
  {
    System.out.println("SB-1");
  }
  {
    System.out.println("NSB-2");
  }
  public static void main(String[] args){
    Book1 b1=new Book1();
    Book1 b2=new Book1();
    Book1 b3=new Book1();
  }
}
