import java.util.Scanner;
class Biggest{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int n3=sc.nextInt();
    int big=n1;
    if(n2>big)
     big=n2;
    else if(n3>big)
     big=n3;
    System.out.println(big+" is Biggest number among the three integers");
  }
}
