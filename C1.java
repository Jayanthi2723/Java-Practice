class C1{
  static int n=50;
  static
  {
    m1();
  }
  public static void main(String[] args){
    int n=50;
    System.out.println(n);
    n=75;
    System.out.println(C1.n);
  }
  public static void m1(){
    n=60;
  }
}
