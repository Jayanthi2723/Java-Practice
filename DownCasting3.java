class DownCasting3{
  public static void main(String[] args){
    DownCasting d=new mala("jayadev","udupi",56.332);
    System.out.println(d.sp);
    System.out.println(d.ds);
    //System.out.println(d.price);

    mala m=(mala)d;
    m.details();
  }
}
class mala extends DownCasting{
  double price;
  public mala(String sp,String ds,double price){
    this.sp=sp;
    this.ds=ds;
    this.price=price;
  }
  public void details(){
    System.out.println(sp);
    System.out.println(ds);
    System.out.println(price);
  }
}
