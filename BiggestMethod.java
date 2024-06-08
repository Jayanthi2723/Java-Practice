import java.util.Scanner;
class BiggestMethod{
  public static int isBiggest(int n1,int n2,int n3){
    if(n1>n2&&n1>n3)
     return n1;
    else if(n2>n3)
     return n2;
    else
     return n3;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int n3=sc.nextInt();
    System.out.println("Biggest number is "+isBiggest(n1,n2,n3));
  }
}
