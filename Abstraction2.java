abstract class Abstract1{
  public abstract void sendM();
}
abstract class phpay extends Abstract1{

}
class gpay extends phpay{
  @Override
  public void sendM(){
    System.out.println("ringing");
  }
}
class Abstraction2{
  public static void main(String[] args){
    gpay g=new gpay();
    g.sendM();

    Abstract1 a=new gpay();
    a.sendM();

    phpay p=new gpay();
    p.sendM();
  }
}
