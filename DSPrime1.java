import java.util.Scanner;
class DSPrime1{
  static boolean isPrime(int n){
    for(int i=2;i<=n/2;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  static boolean checkPrime(int n){
    if(n==1){
      return false;
    }
    if(n==2||n==3){
      return true;
    }
    if(n%2==0||n%3==0){
      return false;
    }
    for(int i=5;i*i<=n;i=i+6){
      if(n%i==0||n%(i+2)==0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number to check");
    int n=sc.nextInt();
    System.out.println(isPrime(n));
    System.out.println(checkPrime(n));
  }
}
