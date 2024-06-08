import java.util.Scanner;
class SumMethod{
  public static int isSum(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
      sum=sum+i;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("sum of n natural number is "+isSum(n));
  }
}
