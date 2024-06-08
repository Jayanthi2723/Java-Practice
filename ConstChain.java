class ConstChain{
  String name;
  String color;
  double price;
  public ConstChain(String name){
    this.name=name;
  }
  public ConstChain(String name,String color){
    this(name);
    this.color=color;
  }
  public ConstChain(String name,String color,double price){
    this(name,color);
    this.price=price;
  }
  public ConstChain(String name,double salary){
    this(name);
    this.price=price;
  }
  public void allDetails(){
    System.out.println(name);
    System.out.println(color);
    System.out.println(price);
  }
  public static void main(String[] args){
    ConstChain c1=new ConstChain("orange","orange",54.23);
    ConstChain c2=new ConstChain("grapes",64.21);
    ConstChain c3=new ConstChain("apple");
    c1.allDetails();
    c2.allDetails();
    c3.allDetails();
  }
}
