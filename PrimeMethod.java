import java.util.Scanner;
class PrimeMethod{
  public static boolean isPrime(int n){
    int count=0;
    for(int i=1;i<=n/2;i++){
      if(n%i==0)
       count++;
    }
    if(count>1)
     return false;
    else
     return true;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean rs=isPrime(n);
    if(rs==true)
     System.out.println(n+" is prime number");
    else
     System.out.println(n+" is not a prime number");
  }
}
