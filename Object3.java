class Object3{
  String name;
  String type;
  public void app(){
    System.out.println(name);
    System.out.println(type);
  }
  public static void main(String[] args){
    Object3 b1=new Object3();
    b1.name="Zomoto";
    b1.type="food ordering";
    Object3 b2=new Object3();
    b2.name="makemtTrip";
    b2.type="Ticket booking";
    b1.app();
    b2.app();
  }
}
