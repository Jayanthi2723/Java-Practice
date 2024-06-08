class Method{
  static int n=3;
  public static void main(String[] args){
    //System.out.println(even(n));
    even(n);
    prime(n);
    pnz(n);
  }
  public static void even(int n){
    if(n%2==0)
      System.out.println("Even");
    else
      System.out.println("Odd");
    //return n;
  }
  public static void prime(int n){
    int count=0;
    for(int i=1;i<=n;i++){
      if(n%i==0)
        count++;
    }
    if(count==2)
      System.out.println("Prime");
    else
      System.out.println("Not a Prime");
  }
  public static void pnz(int n){
    if(n>0)
      System.out.println("+ve");
    else
      System.out.println("-ve");
    if(n==0)
      System.out.println("Zero");
  }
}
