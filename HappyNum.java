import java.util.Scanner;
class HappyNum{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int rev=0,sum=0;
    int org=n;
    while(org!=0){
      rev=org%10;
      sum=sum+rev*rev;
      org=org/10;
    }
    if(sum==1)
      System.out.println("Happy");
    else if(sum==4)
      System.out.println("unhappy");
    else
      System.out.println("Not a Happy number");
  }
}
