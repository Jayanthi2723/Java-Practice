class Inheritance{
  String car="bmw";
  double cash=50.000000;
  public static void main(String[] args){
    Child c1=new Child();
    System.out.println(c1.car);
    System.out.println(c1.cash);
    Inheritance p1=new Inheritance();
    System.out.println(p1.car);
    System.out.println(p1.cash);
    Inheritance p2=new Child();
    System.out.println(p2.car);
    System.out.println(p2.cash);
    // Child c2=new Inheritance;//child class members cannot inherited to parent class
  }
}
class Child extends Inheritance{
}
