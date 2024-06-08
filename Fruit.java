class Fruit{
  String name;
  String color;
  public static void main(String[] args){
    Fruit f1=new Fruit();
    f1.name="Apple";
    f1.color="Red";
    Fruit f2= new Fruit();
    f2.name="Mango";
    f2.color="Yellow";
    Fruit f3=new Fruit();
    f3.name="Grapes";
    f3.color="Green";
    System.out.println(f1.name);
    System.out.println(f1.color);
    System.out.println(f2.name);
    System.out.println(f2.color);
    System.out.println(f3.name);
    System.out.println(f3.color);
  }
}
