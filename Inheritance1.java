class Inheritance1{
  String name="apple";
  String color="red";
  public static void main(String[] args){
    Child c1=new Child();
    System.out.println(c1.name);
    System.out.println(c1.color);
    System.out.println(c1.price);

    Inheritance1 e1=new Inheritance1();
    System.out.println(e1.name);
    System.out.println(e1.color);
    //System.out.println(e1.price);//cannot access child members from parent objects


    Inheritance1 e2=new Child();//UpCasting
    System.out.println(e2.name);
    System.out.println(e2.color);
    //System.out.println(e2.price);//cannot access child members from parent objects

    // Child c2=new Inheritance1();//cannot convert child to Parent
    // System.out.println(c2.name);
    // System.out.println(c2.color);
    // System.out.println(c2.price);

    Child c2=(Child)e2;//DownCasting
    System.out.println(c2.name);
    System.out.println(c2.color);
    System.out.println(c2.price);
  }
}
class Child extends Inheritance1{
  double price=34.23;
}
