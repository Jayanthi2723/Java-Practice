class Constructor{
  String title;
  int pages;
  {
    System.out.println("non static");
  }
  static
  {
    System.out.println("static");
  }
  {
    System.out.println("ns1");
  }
  public static void main(String[] args){
    Constructor c1=new Constructor();
    Constructor c2=new Constructor();
    Constructor c3=new Constructor();
  }
}
