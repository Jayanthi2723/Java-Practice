class ConstChain5{
  String name;
  int id;
  public ConstChain5(String name,int id){
    this.name=name;
    this.id=id;
  }
  public static void main(String[] args){
    student s=new student("jaya",4,35);
    System.out.println(s.name);
    System.out.println(s.id);
    System.out.println(s.age);
  }
}
class student extends ConstChain5{
  int age;
  public student(String name,int id,int age){
    super(name,id);
    this.age=age;
  }
}
