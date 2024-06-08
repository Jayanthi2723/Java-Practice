class Overriding{
  public void house(){
    System.out.println("Green");
  }
  public static void main(String[] args) {
    child c=new child();
    c.house();
  }
}
class child extends Overriding{
  public void house(){
    System.out.println("Blue");
  }
}
