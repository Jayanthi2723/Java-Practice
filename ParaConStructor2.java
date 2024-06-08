class ParaConStructor2{
  String name;
  int eid;
  double salary;
  public ParaConStructor2(String name,int eid,double salary){
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
    ParaConStructor2 p1=new ParaConStructor2("jaya",23,46574.465);
    p1.allDetails();
    ParaConStructor2 p2=new ParaConStructor2("raya",22,474.465);
    p2.allDetails();
  }
}
