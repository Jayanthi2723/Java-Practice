class Book{
  String title;
  int noOfPages;
  public static void main(String[] args){
    Book b1= new Book();
    b1.title="TRU NOTE";
    b1.noOfPages=140;
    Book b2=new Book();
    b2.title="Rio Student";
    b2.noOfPages=72;
    System.out.println(b1.title);
    System.out.println(b1.noOfPages);
    System.out.println(b2.title);
    System.out.println(b2.noOfPages);
  }
}
