class Employee{
  String name;
  int eid;
  double salary;
  public Employee(String name,int eid,double salary){
    this.name=name;
    this.eid=eid;
    this.salary=salary;
  }
  public void eDetails(){
    System.out.println(name);
    System.out.println(eid);
    System.out.println(salary);
  }
  public static void main(String[] args){
    Employee e1=new Employee("sheela",474,748758.99);
    Employee e2=new Employee("mala",634,74567.765);
    e1.eDetails();
    e2.eDetails();
  }
}
