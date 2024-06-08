class DownCasting2{
  public static void main(String[] args){
    DownCasting1 d1=new laila("jaya",23,34,4354657);
    System.out.println(d1.name);
    System.out.println(d1.id);
    System.out.println(d1.age);

    laila l1=(laila)d1;
    l1.details();
  }
}
class laila extends DownCasting1{
  long alco;
  public laila(String name,int id,int age,long alco){
    this.name=name;
    this.id=id;
    this.age=age;
    this.alco=alco;
  }
  public void details(){
    System.out.println(name);
    System.out.println(id);
    System.out.println(age);
    System.out.println(alco);
  }
}
