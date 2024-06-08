import java.util.Scanner;
class PalindromeNum{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int rev;
    int sum=0;
    int org=n;
    for(; n!=0;n/=10){
      rev=n%10;
      sum=(sum*10)+rev;
    }
    if(sum==org)
      System.out.println("PalindromeNum");
    else
     System.out.println("Not a PalindromeNum");
  }
}
