class Static3{
  static int n=3;
  public static void main(String[] args){
    even(n);
    prime(n);
    pnz(n);
  }
  public static void even(int n){
    if(n%2==0)
      System.out.println("even");
    else
      System.out.println("odd");
  }
  public static void prime(int n){
    int count=0;
    for(int i=1;i<=n;i++){
      if(n%i==0)
        count++;
    }
    if(count==2)
       System.out.println("prime");
    else
       System.out.println("not a prime");
  }
  public static void pnz(int n){
    if(n>0)
      System.out.println("positive");
    else if(n==0)
      System.out.println("zero");
    else
      System.out.println("negative");
  }
}
