class ConstOver{
  String name;
  String color;
  int price;
  public ConstOver(String name){
    this.name=name;
  }
  public ConstOver(String name,String color){
    this.name=name;
    this.color=color;
  }
  public ConstOver(String name,String color,int price){
    this.name=name;
    this.color=color;
    this.price=price;
  }
  public ConstOver(String name,int price){
    this.name=name;
    this.price=price;
  }
  public void allDetails(){
    System.out.println(name);
    System.out.println(color);
    System.out.println(price);
  }
  public static void main(String[] args){
    ConstOver c1=new ConstOver("orange",345);
    ConstOver c2=new ConstOver("grapes","green",465);
    ConstOver c3=new ConstOver("apple");
    c1.allDetails();
    c2.allDetails();
    c3.allDetails();
  }
}
