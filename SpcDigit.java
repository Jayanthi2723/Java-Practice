import java.util.Scanner;
class SpcDigit{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int d1=n/10;
    int d2=n%10;
    int sum=d1+d2+d1*d2;
    if(sum==n)
     System.out.println(n+":is Special digit");
    else
     System.out.println(n+":is not a Special digit");
  }
}
