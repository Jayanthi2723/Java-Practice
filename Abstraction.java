abstract class Abstraction1{
  public abstract void m1();
}
class child extends Abstraction1{
  @Override
  public void m1(){
    System.out.println("pandhi fellow");
  }
}
class Abstraction{
  public static void main(String[] args){
    child c=new child();
    c.m1();
  }
}
