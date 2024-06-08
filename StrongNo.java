import java.util.Scanner;
class StrongNo{
  public static boolean isStrong(int n){
    int sum=0,tem=n;
    do{
      int d=n%10;
      sum=sum+isFact(d);
      n=n/10;
    }while(n!=0);
    return sum==tem;
  }
  public static int isFact(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
      fact=fact*i;
    }
    return fact;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean rs=isStrong(n);
    if(rs==true)
     System.out.println(n+" is strong number");
    else
     System.out.println(n+" is not a strong number");
  }
}
