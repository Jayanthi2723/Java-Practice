class Employee1{
  String name;
  int eid;
  double salary;
  public Employee1(String name,int eid,double salary){
    this.name=name;
    this.eid=eid;
    this.salary=salary;
  }
  public Employee1(String name,int eid){
    this.name=name;
    this.eid=eid;
  }
  public Employee1(String name){
    this.name=name;
  }
  public void eDetails(){
    System.out.println(name);
    System.out.println(eid);
    System.out.println(salary);
  }
  public static void main(String[] args){
    Employee1 e1=new Employee1("mala",3654,85958.465);
    Employee1 e2=new Employee1("sheela",4635);
    Employee1 e3=new Employee1("laila");
    e1.eDetails();
    e2.eDetails();
    e3.eDetails();
  }
}
