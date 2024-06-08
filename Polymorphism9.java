class Polymorphism9{
  public void message(){
    System.out.println("text");
  }
  public static void main(String[] args){
    child c=new child();
    c.message();
    c.mine();
  }
}
class child extends Polymorphism9{
  public void message(){
    System.out.println("insta");
  }
  public  void mine(){
    System.out.println("reels");
  }
}
