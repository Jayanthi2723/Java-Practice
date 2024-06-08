class App1{
  String name;
  double size;
  String type;
  public void allDetails(){
    System.out.println(name);
    System.out.println(size);
    System.out.println(type);
  }
  public void initialize(String name,double size,String type){
    this.name=name;
    this.size=size;
    this.type=type;
  }
  public static void main(String[] args){
    App1 a1= new App1();
    a1.initialize("Zomato",10.0,"Food Ordering");
    App1 a2=new App1();
    a2.initialize("MakeMyTrip",12.32,"Ticket Booking");
    a1.allDetails();
    a2.allDetails();
  }
}
