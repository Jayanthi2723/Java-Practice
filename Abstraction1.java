abstract class Abstract{
  public abstract void nine();
  public abstract void ten();
  public void call(){
    System.out.println("calling");
  }
}
class child extends Abstract{
  @Override
  public void nine(){
    System.out.println("kukka");
  }
  @Override
  public void ten(){
    System.out.println("nakka");
  }
}
class Abstraction1{
  public static void main(String[] args){
    child c=new child();
    c.nine();
    c.ten();
    c.call();

    Abstract a1=new child();
    a1.nine();
    a1.ten();
    a1.call();

    child c1=(child)a1;
    c1.nine();
    c1.ten();
    c1.call();
  }
}
