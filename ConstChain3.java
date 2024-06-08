class ConstChain3{
  String brand;
  double price;
  public ConstChain3(String brand,double price){
    this.brand=brand;
    this.price=price;
  }
  public static void main(String[] args){
    car c=new car("pulsor",5000000.0,32,"re");
    System.out.println(c.brand);
    System.out.println(c.price);
    System.out.println(c.cc);
    System.out.println(c.type);
  }
}
class car extends ConstChain3{
  int cc;
  String type;
  public car(String brand,double price,int cc,String type){
    super(brand,price);
    this.cc=cc;
    this.type=type;
  }
}
