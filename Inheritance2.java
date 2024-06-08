class Inheritance2{
  String name;
  String color;
  public static void main(String[] args){
    Child c1=new Child("apple","red",35.23);
    System.out.println(c1.name);
    System.out.println(c1.color);
    System.out.println(c1.price);
    Inheritance2 e1=new Inheritance2();
    e1.name="orange";
    e1.color="orange";
    System.out.println(e1.name);
    System.out.println(e1.color);
    //System.out.println(e1.price);
    Inheritance2 e2=new Child("grapes","green",23.34);//UpCasting
    System.out.println(e2.name);
    System.out.println(e2.color);
    //System.out.println(e2.price);
    Child c=(Child)e2;//DownCasting
    System.out.println(c.name);
    System.out.println(c.color);
    System.out.println(c.price);
  }
}
class Child extends Inheritance2{
  double price;
  public Child(String name,String color,double price){
    this.name=name;
    this.color=color;
    this.price=price;
  }
}
