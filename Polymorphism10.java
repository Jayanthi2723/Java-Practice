class Polymorphism10{
  public void up(){
    System.out.println("upload status");
  }
  public void sms(){
    System.out.println("texting");
  }
  public static void main(String[] args){
    child c=new child();
    c.up();
    c.sms();
    c.none();
  }
}
class child extends Polymorphism10{
  public void up(){
    System.out.println("waste jspiders");
  }
  public void none(){
    System.out.println("some wt better");
  }
}
