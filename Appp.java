class Appp{
  String name;
  double size;
  public static void main(String[] args){
    Appp a=new Facebook("Fb",123.30,"sheela@123","torture");
    System.out.println(a.name);
    System.out.println(a.size);
    System.out.println(a.uN);
    System.out.println(a.pwd);
  }
}
class Facebook extends Appp
{
  String uN;
  String pwd;
  public Facebook(String name,double size,String uN,String pwd){
    this.name=name;
    this.size=size;
    this.uN=uN;
    this.pwd=pwd;
  }
}
