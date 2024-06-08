class Student1{
  String name;
  int id;
  long cNo;
  public void allDetails(){
    System.out.println(name);
    System.out.println(id);
    System.out.println(cNo);
  }
  public void initialize(String name,int id,long cNo){
    this.name=name;
    this.id=id;
    this.cNo=cNo;
  }
  public static void main(String[] args){
    Student1 s1=new Student1();
    s1.initialize("sheela",34,121346567L);
    Student1 s2=new Student1();
    s2.initialize("laila",76,6437563745L);
    s1.allDetails();
    s2.allDetails();
  }
}
