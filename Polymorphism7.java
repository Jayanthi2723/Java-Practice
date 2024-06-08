class Polymorphism7{
  public void house(){
    System.out.println("green");
  }
  public static void main(String[] args){
    child c=new child();
    c.house();
    c.house();
    Polymorphism7 p=new child();
    p.house();

    Polymorphism7 p7=new Polymorphism7();
    p7.house();
  }
}
class  child extends Polymorphism7{
  public void house(){
    System.out.println("blue");
  }
}
