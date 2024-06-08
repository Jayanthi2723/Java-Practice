class Polymorphism3{//variable shadowong
  int a=20;
  public static void main(String[] args){
    child c=new child();
    System.out.println(c.a);
    Polymorphism3 p=new Polymorphism3();
    System.out.println(p.a);
    Polymorphism3 p1=new child();
    System.out.println(p1.a);
    child c1=(child)p1;
    System.out.println(c1.a);
  }
}
class child extends Polymorphism3{
  int a=40;
}
