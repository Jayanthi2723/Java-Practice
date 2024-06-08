class Cab{
  String sp;
  String d;
  int fare;
  public static void main(String[] args){
    Cab c=new Mini("pd","java cls",655);
    System.out.println(c.sp);
    System.out.println(c.d);
    System.out.println(c.fare);


    Cab c1=new Suv("native","java",6546);
    System.out.println(c1.sp);
    System.out.println(c1.d);
    System.out.println(c1.fare);


    Cab c2=new Prime("native","java",6546);
    System.out.println(c2.sp);
    System.out.println(c2.d);
    System.out.println(c2.fare);
  }
}
class Mini extends Cab{
  public Mini(String sp,String d,int fare){
    this.sp=sp;
    this.d=d;
    this.fare=fare;
  }
}
class Suv extends Cab{
  public Suv(String s,String d,int fare){
    this.sp=sp;
    this.d=d;
    this.fare=fare;
  }
}
class Prime extends Cab{
  public Prime(String sp,String d,int fare){
    this.sp=sp;
    this.d=d;
    this.fare=fare;
  }
}
