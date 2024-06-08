class ConstOver1{
  String name;
  int eid;
  double salary;
  public ConstOver1(String name){
    this.name=name;
  }
  public ConstOver1(String name,int eid){
    this.name=name;
    this.eid=eid;
  }
  public ConstOver1(String name,int eid,double salary){
    this.name=name;
    this.eid=eid;
    this.salary=salary;
  }
  public void allDetails(){
    System.out.println(name);
    System.out.println(eid);
    System.out.println(salary);
  }
  public static void main(String[] args){
    ConstOver1 c1=new ConstOver1("jaya",23,2332.45);
    ConstOver1 c2=new ConstOver1("raya",34,656.756);
    c1.allDetails();
    c2.allDetails();
  }
}
