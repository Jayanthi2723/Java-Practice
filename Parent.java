class Parent{
  String car;
  public static void main(String[] args){
    Parent p=new child("Bmw");
    System.out.println(p.car);
  }
}
class child extends Parent{
  public child(String car){
    this.car=car;
  }
}
