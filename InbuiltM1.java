class InbuiltM1{
  String title;
  int pages;
  public InbuiltM1(String title,int pages){
    this.title=title;
    this.pages=pages;
  }
  public static void main(String[] args){
    InbuiltM1 v=new InbuiltM1("after",786);
    System.out.println(v.title);
    System.out.println(v.pages);

    InbuiltM1 v1=v;
    System.out.println(v==v1);
    System.out.println(v.equals(v1));

    InbuiltM1 v2=new InbuiltM1("after",786);
    System.out.println(v==v2);
    System.out.println(v.equals(v2));
  }
}
