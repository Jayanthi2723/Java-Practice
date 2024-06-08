class UpCasting1{
  String sp;
  String dp;
  double price;
  public static void main(String[] args){
    UpCasting1 u1=new Child("jayadev","udupi",67.34);
    System.out.println(u1.sp);
    System.out.println(u1.dp);
    System.out.println(u1.price);

  }
}
class Child extends UpCasting1{
  public Child(String sp,String dp,double price){
    this.sp=sp;
    this.dp=dp;
    this.price=price;
  }
}
