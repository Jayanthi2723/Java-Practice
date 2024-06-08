class Object4{
  String name;
  int ram;
  int storage;
  public void allDetails(){
    System.out.println(name);
    System.out.println(ram);
    System.out.println(storage);
  }
  public static void main(String[] args){
    Object4 b1=new Object4();
    b1.name="1+";
    b1.ram=23;
    b1.storage=210;
    Object4 b2=new Object4();
    b2.name="2+";
    b2.ram=24;
    b2.storage=230;
    b1.allDetails();
    b2.allDetails();
  }
}
