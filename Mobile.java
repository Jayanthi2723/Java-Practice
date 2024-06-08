class Mobile{
  String name;
  int ram;
  int storage;
  public void aboutPhone(){
    System.out.println(name);
    System.out.println(ram);
    System.out.println(storage);
  }
  public static void main(String[] args){
    Mobile m1=new Mobile();
    m1.name="1+";
    m1.ram=18;
    m1.storage=256;
    Mobile m2=new Mobile();
    m2.name="iphone 15 pro max";
    m2.ram=30;
    m2.storage=700;
    m1.aboutPhone();
    m2.aboutPhone();
  }
}
