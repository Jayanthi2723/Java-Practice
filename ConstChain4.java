class ConstChain4{
  String sp;
  String d;
  public ConstChain4(String sp,String d){
    this.sp=sp;
    this.d=d;
  }
  public static void main(String[] args){
    map m=new map("jayadev","udupi",56746574);
    System.out.println(m.sp);
    System.out.println(m.d);
    System.out.println(m.cno);
  }
}
class map extends ConstChain4{
  long cno;
  public map(String sp,String d,long cno){
    super(sp,d);
    this.cno=cno;
  }
}
