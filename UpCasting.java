class UpCasting{
  String car;
  public static void main(String[] args){
    UpCasting u1=new Child("bmw");
    System.out.println(u1.car);
  }
}
class Child extends UpCasting{
  public Child(String car){
    this.car=car;
  }
}
