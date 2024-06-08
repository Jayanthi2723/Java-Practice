class Book{
  String title;
  int pages;
  public Book(String title,int pages){
    this.title=title;
    this.pages=pages;
  }
  public boolean equals(Object obj){
    Book b=(Book)obj;
    if(this.title==b.title && this.pages==b.pages)
       return true;
    else
       return false;
  }
}
class InbuiltM2{
  public static void main(String[] args) {
    Book b=new Book("ever",567);
    Book b2=b;
    System.out.println(b.equals(b2));

  }
}
