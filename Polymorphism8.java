class Polymorphism8{
  public void send(){
    System.out.println("text");
  }
  public void insta(){
    System.out.println("reels");
  }
  public void mine(){
    System.out.println("love");
  }
  public static void main(String[] args) {
    child c=new child();
    c.insta();
    c.send();
    c.mine();
  }
}
class child extends Polymorphism8{
  public void insta(){
    System.out.println("video");
  }
  public void send(){
    System.out.println("message");
  }
}
