class Vehicle{
  String name;
  int noOfWheels;
  int cc;
  public Vehicle(String name,int noOfWheels,int cc){
    this.name=name;
    this.noOfWheels=noOfWheels;
    this.cc=cc;
  }
  public static void main(String[] args){
    Bike b1=new Bike("motor vehicle",2,360,"RE");
    Bike b2=new Bike("motor bike",2,120,"hero");
    // b1.bikeDetails();
    // b2.bikeDetails();
    System.out.println(b1.name);
    System.out.println(b1.noOfWheels);
    System.out.println(b1.cc);
    System.out.println(b1.brand);


    Vehicle v1=new Vehicle("motor vehicle",2,360);
    System.out.println(v1.name);
    System.out.println(v1.noOfWheels);
    System.out.println(v1.cc);
    //System.out.println(v1.brand);
  }
}
class Bike extends Vehicle{
    String brand;
    public  Bike(String name,int noOfWheels,int cc,String brand){
      // this.name=name;
      // this.noOfWheels=noOfWheels;
      // this.cc=cc;
      super(name,noOfWheels,cc);
      this.brand=brand;
    }
  //   public void bikeDetails(){
  //     System.out.println(name);
  //     System.out.println(noOfWheels);
  //     System.out.println(cc);
  //     System.out.println(brand);
  // }
}
