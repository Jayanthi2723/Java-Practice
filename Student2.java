class Student2{
  String name;
  long cNo;
  public static void main(String[] args){
    Employee e1=new Employee("ngf",65978,65,8759687);
    e1.eDetails();
  }
}
class Employee extends Student2{
  int eid;
  double salary;
  public Employee(String name,long cNo,int eid,double salary){
    this.name=name;
    this.cNo=cNo;
    this.eid=eid;
    this.salary=salary;
  }
  public void eDetails(){
    System.out.println(name);
    System.out.println(cNo);
    System.out.println(eid);
    System.out.println(salary);
  }
}
