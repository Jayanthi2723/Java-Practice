class ConstOver2{
  String name;
  double salary;
  long accNo;
  public ConstOver2(String name){
    this.name=name;
  }
  public ConstOver2(String name,double salary){
    this.name=name;
    this.salary=salary;
  }
  public ConstOver2(String name,double salary,long accNo){
    this.name=name;
    this.salary=salary;
    this.accNo=accNo;
  }
  public void allDetails(){
    System.out.println(name);
    System.out.println(salary);
    System.out.println(accNo);
  }
  public static void main(String[] args){
    ConstOver2 c1=new ConstOver2("jaya",45.78);
    ConstOver2 c2=new ConstOver2("raya",623.78637);
    ConstOver2 c3=new ConstOver2("maya",78.65,562675727);
    c1.allDetails();
    c2.allDetails();
    c3.allDetails();
  }
}
