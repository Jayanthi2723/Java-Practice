class A{
  int a;
  String b;
  public A(int a,String b){
    this.a=a;
    this.b=b;
  }
  public static void main(String[] args){
    B b1=new B(2,"hello",2);
    System.out.println(b1.a);
    System.out.println(b1.b);
    System.out.println(b1.c);
  }
}
class B extends A{
  int c;
  public B(int a,String b,int c){
    super(a,b);
    this.c=c;
  }
}
