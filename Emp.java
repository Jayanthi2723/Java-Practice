class Emp{
  String name;
  int eid;
  double salary;
  public Emp(String name){
    this.name=name;
  }
  public Emp(String name,int eid){
    this(name);
    this.eid=eid;
  }
  public Emp(String name,int eid,double salary){
    this(name,eid);
    this.salary=salary;
  }
  public void eDetails(){
    System.out.println(name);
    System.out.println(eid);
    System.out.println(salary);
  }
  public static void main(String[] args){
    Emp e1=new Emp("sheela",354,774.7657);
    Emp e2=new Emp("smith",7465);
    e1.eDetails();
    e2.eDetails();
  }
}
