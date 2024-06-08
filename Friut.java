class Friut{
  String name;
  String color;
  public static void main(String[] args){
    Apple a1=new Apple("apple","red",100);
    a1.fDetails();
  }
}
class Apple extends Friut
{
  double price;
  public Apple(String name,String color,double price){
    this.name=name;
    this.color=color;
    this.price=price;
  }
  public void fDetails(){
    System.out.println(name);
    System.out.println(color);
    System.out.println(price);
  }
}
