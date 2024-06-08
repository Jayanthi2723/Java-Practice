class UpCasting2{
  String name;
  double size;
  public static void main(String[] args){
    UpCasting2 c1=new Child("jaya",23.23,"tr46333424222","65346gfhe");//UpCasting
    System.out.println(c1.name);
    System.out.println(c1.size);
    System.out.println(c1.un);
    System.out.println(c1.pwd);
  }
}
class Child extends UpCasting2{
  String un;
  String pwd;
  public Child(String name,double size,String un,String pwd){
    this.name=name;
    this.size=size;
    this.un=un;
    this.pwd=pwd;
  }
}
