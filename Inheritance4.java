class Inheritance4{
  String sp;
  String ds;
  public static void main(String[] args){
    Child c1=new Child("bar","restaurent",56347365);
    c1.mapDetails();
  }
}
class Child extends Inheritance4{
  long ph;
  public Child(String sp,String ds,long ph){
    this.sp=sp;
    this.ds=ds;
    this.ph=ph;
  }
  public void mapDetails(){
    System.out.println(sp);
    System.out.println(ds);
    System.out.println(ph);
  }
}
