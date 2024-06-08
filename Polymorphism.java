class Polymorphism{//method overloading
  public static void add(int a,int b){
    System.out.println(a+b);
  }
  public static void add(int a,int b,int c){
    System.out.println(a+b+c);
  }
  public static void main(String[] args){
    add(12,23);
    add(3,4,5);
  }
}
