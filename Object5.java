class Object5{
  String name;
  String color;
  int price;
  public void allDetails(){
    System.out.println(name);
    System.out.println(color);
    System.out.println(price);
  }
  public static void main(String[] args){
    Object5 b1=new Object5();
    b1.name="orange";
    b1.color="orange";
    b1.price=123;
    Object5 b2=new Object5();
    b2.name="grapes";
    b2.color="green";
    b2.price=132;
    b1.allDetails();
    b2.allDetails();
  }
}
