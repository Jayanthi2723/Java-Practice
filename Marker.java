class Marker{
  String color;
  double price;
  public static void main(String[] args){
    Marker m1=new Marker();
    m1.color="Black";
    m1.price=15.0;
    Marker m2=new Marker();
    m2.color="Green";
    m2.price=25.0;
    System.out.println(m1.color);
    System.out.println(m1.price);
    System.out.println(m2.color);
    System.out.println(m2.price);
  }
}
