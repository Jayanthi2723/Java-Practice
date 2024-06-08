class Polymorphism5{
  public static void m1(){
    System.out.println("parent");
  }
  public static void main(String[] args){
    child c=new child();
    c.m1();
    Polymorphism5 p=new child();
    p.m1();
  }
}
class child extends Polymorphism5{
  public static void m1(){
    System.out.println("child");
  }
}
