class Polymorphism6{
  public static void mine(){
    System.out.println("bharath");
  }
  public static void main(String[] args) {
    love l=new love();
    l.mine();
    Polymorphism6 p=new love();
    p.mine();
  }
}
class love extends Polymorphism6{
  public static void mine(){
    System.out.println("bharathwaj");
  }
}
