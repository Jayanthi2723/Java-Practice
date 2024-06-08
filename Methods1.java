class Methods1{
  static int a=10;
  static int b=20;
  public static void main(String[] args){
    System.out.println("Main Start");
    add();
    sub();
    mul();
    div();
    mod();
    System.out.println("Main End");
  }
  public static void add(){
    System.out.println(a+b);
  }
  public static void sub(){
    System.out.println(a-b);
  }
  public static void mul(){
    System.out.println(a*b);
  }
  public static void div(){
    System.out.println(b/a);
  }
  public static void mod(){
    System.out.println(b%a);
  }
}
