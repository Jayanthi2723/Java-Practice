class This2{
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
    This2 b1=new This2();
    This2 b2=new This2();
    This2 b3=new This2();
    b1.initialize("orange","orange");
    b2.initialize("grapes","green");
    b3.initialize("apple","red");
    b1.allDetails();
    b2.allDetails();
    b3.allDetails();
  }
}
