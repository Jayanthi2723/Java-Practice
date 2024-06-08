class App{
  String name;
  double size;
  String type;
  public void allDetails(){
    System.out.println(name);
    System.out.println(size);
    System.out.println(type);
  }
  public static void main(String[] args){
    App a1=new App();
    a1.name="Zomato";
    a1.size=10;
    a1.type="Food Ordering";
    App a2=new App();
    a2.name="MakeMyTrip";
    a2.size=15;
    a2.type="Ticket Booking";
    a1.allDetails();
    a2.allDetails();
  }
}
