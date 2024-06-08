class Static6{
  static int n=3;//global
  static{
    m1(n);
  }
  public static void main(String[] args){
    System.out.println(n);
    System.out.println(Static6.n);
  }
  public static void m1(int n){
    n=5;//local
    System.out.println(n*10);//50
    System.out.println(Static6.n*5);//15
  }
}
