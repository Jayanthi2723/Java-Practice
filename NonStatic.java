class NonStatic{
  int a=50;
  int b=60;
  public void m1(){
    System.out.println(a);
    System.out.println(b);
  }
  public static void main(String[] args){
    int a=40;
    int b=50;
    System.out.println(a);
    System.out.println(b);
    NonStatic n1=new NonStatic();
    n1.m1();
  }
}
