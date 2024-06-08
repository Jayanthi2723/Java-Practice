class This3{
  String name;
  int size;
  String type;
  public void allDetails(){
    System.out.println(name);
    System.out.println(size);
    System.out.println(type);
  }
  public void initialize(String name,int size,String type){
    this.name=name;
    this.size=size;
    this.type=type;
  }
  public static void main(String[] args){
    This3 b1=new This3();
    This3 b2=new This3();
    b1.initialize("zomoto",232,"food ordering");
    b2.initialize("makemytrip",233,"ticket booking");
    b1.allDetails();
    b2.allDetails();
  }
}
