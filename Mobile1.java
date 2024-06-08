class Mobile1{
  String brand;
  int ram;
  int storage;
  public void aboutPhone(){
    System.out.println(brand);
    System.out.println(ram);
    System.out.println(storage);
  }
  public void initialize(String brand,int ram,int storage){
    this.brand=brand;
    this.ram=ram;
    this.storage=storage;
  }
  public static void main(String[] args){
    Mobile1 m1= new Mobile1();
    m1.initialize("1+",18,256);
    Mobile1 m2=new Mobile1();
    m2.initialize("iPhone 15 pro max",30,756);
    m1.aboutPhone();
    m2.aboutPhone();
  }
}
