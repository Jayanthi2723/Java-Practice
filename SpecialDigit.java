import java.util.Scanner;
class SpecialDigit{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int d1=n/10;
    int d2=n%10;
    int sum=d1+d2+d1*d2;
    if(sum==n)
       System.out.println(n+"SpecialDigit ");
    else
       System.out.println(n+"not a SpecialDigit");
  }
}
