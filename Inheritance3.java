class Inheritance3{
  String name;
  int eid;
  public void empDetails(){
    System.out.println(name);
    System.out.println(eid);
    //System.out.println(ph);
  }
  public static void main(String[] args){
    Child c1=new Child("jaya",56,78632235);
    c1.empDetails();
    Inheritance3 e1=new Child("raya",69,76486232);
    e1.empDetails();
    System.out.println(e1.name);
    System.out.println(e1.eid);
    //System.out.println(ph);
  }
}
class Child extends Inheritance3{
  long ph;
  public Child(String name,int eid,long ph){
    this.name=name;
    this.eid=eid;
    this.ph=ph;
  }
  public void empDetails(){
    System.out.println(name);
    System.out.println(eid);
    System.out.println(ph);
  }
}
