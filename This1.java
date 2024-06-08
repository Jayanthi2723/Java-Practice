class This1{
  String name;
  int id;
  long cno;
  public void allDetails(){
    System.out.println(name);
    System.out.println(id);
    System.out.println(cno);
  }
  public void initialize(String name,int id,long cno){
    this.name=name;
    this.id=id;
    this.cno=cno;
  }
  public static void main(String[] args){
    This1 b1=new This1();
    This1 b2=new This1();
    b1.initialize("jaya",12,46574658);
    b2.initialize("sai",23,58795875);
    b1.allDetails();
    b2.allDetails();
  }
}
