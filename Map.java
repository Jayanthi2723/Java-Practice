class Map{
  String sp;
  String ds;
  public static void main(String[] args){
    Ola o1=new Ola("jayadev","udupi",532465634);
    o1.mDetails();
  }
}
class Ola extends Map{
  long cNo;
  public Ola(String sp,String ds,long cNo){
    this.sp=sp;
    this.ds=ds;
    this.cNo=cNo;
  }
  public void mDetails(){
    System.out.println(sp);
    System.out.println(ds);
    System.out.println(cNo);
  }
}
