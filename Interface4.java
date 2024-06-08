interface Interface4{
  void m1();
  public static void main(String[] args){
    I2 i=new I2();
    i.m1();

    I1 i1=new I2();
    i1.m1();

    Interface4 i2=new I2();
    i2.m1();
  }
}
interface I1 extends Interface4{
  void m1();
}
class I2 implements I1,Interface4{
  @Override
  public void m1(){
    System.out.println("m1() is Override");
  }
}
