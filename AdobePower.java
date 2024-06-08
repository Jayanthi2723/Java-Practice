import java.util.Scanner;
class AdobePower{
  static boolean powOf2(int n){
    if(n==0){
      return false;
    }
    return (n &(n-1))==0;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(powOf2(n));
  }
}
