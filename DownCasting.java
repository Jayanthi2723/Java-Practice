class DownCasting{
  String sp;
  String ds;
  public static void main(String[] args){
    DownCasting u1=new Mini("udupi","jayadev",5);//UpCasting
    System.out.println(u1.sp);
    System.out.println(u1.ds);
    Mini c=(Mini)u1;//down Casting
    System.out.println(c.price);
  }
}
class Mini extends DownCasting{
  double price;
  public Mini(String sp,String ds,double price){
    this.sp=sp;
    this.ds=ds;
    this.price=price;
  }
}
