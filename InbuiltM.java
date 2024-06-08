class InbuiltM{
  String title;
  int pages;
  public InbuiltM(String title,int pages){
    this.title=title;
    this.pages=pages;
  }
  public static void main(String[] args){
    InbuiltM v=new InbuiltM("ever",2324);
    System.out.println(v.title);
    System.out.println(v.pages);
    System.out.println(v);
  }
}
