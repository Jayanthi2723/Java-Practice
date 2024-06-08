class Polymorphism2{//method overloading
  public static void max(float a,float b){
    if(a>b)
       System.out.println(a);
    else
       System.out.println(b);

  }
  public static void max(int a,int b){
    if(a>b)
       System.out.println(a);
    else
       System.out.println(b);
  }
  public static void max(long a,long b){
    if(a>b)
       System.out.println(a);
    else
       System.out.println(b);
  }
  public static void max(double a,double b){
    if(a>b)
       System.out.println(a);
    else
       System.out.println(b);
  }
  public static void main(String[] args){
    max(23.32f,56.45f);
    max(23,43);
    max(3546L,45676L);
    max(45.65,56.57);
  }
}
