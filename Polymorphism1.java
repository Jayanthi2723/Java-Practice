class Polymorphism1{//method overloading
  public static void mul(int a,int b){
    System.out.println(a*b);
  }
  public static void mul(int a,int b,int c){
    System.out.println(a*b*c);
  }
  public static void mul(int a,int c,double d){
    System.out.println(a*c*d);
  }
  public static void mul(int c,int a,long l){
    System.out.println(c*a*l);
  }
  public static void main(String[] args){
    mul(2,3);
    mul(1,2,3);
    mul(1,2,3.0);
    mul(1,1,23436576889L);
  }
}
