class This{
  String name;
  String color;
  public void allDetails(){
    System.out.println(name);
    System.out.println(color);
  }
  public void initialize(String name,String color){
    this.name=name;
    this.color=color;
  }
  public static void main(String[] args){
    This b1=new This();
    b1.initialize("nokia","black");
    b1.allDetails();
    This b2=new This();
    b2.initialize("redmi","blue");
    b2.allDetails();
  }
}
