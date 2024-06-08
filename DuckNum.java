import java.util.Scanner;
class DuckNum{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
     else if(n%10==0){
        System.out.println("Duck Number");
        n=n/10;
      }
      else
        System.out.println("Not a duck number");
      break;
    }
  }
}
