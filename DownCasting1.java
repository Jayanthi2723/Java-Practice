class DownCasting1{
  String name;
  int id;
  int age;
  public static void main(String[] args){
    DownCasting1 d1=new cab("jaya",123,22,5760453);
    System.out.println(d1.name);
    System.out.println(d1.id);
    System.out.println(d1.age);

    cab c1=(cab)d1;
    c1.details();
  }
}
class cab extends DownCasting1{
  long cno;
  public cab(String name,int id,int age,long cno){
    this.name=name;
    this.id=id;
    this.age=age;
    this.cno=cno;
  }
  public void details(){
    System.out.println(name);
    System.out.println(id);
    System.out.println(age);
    System.out.println(cno);
  }
}
