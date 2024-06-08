import java.util.Scanner;
class PosNeg{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n<0)
     System.out.println(n+" is negative value");
    else if(n>=0)
     System.out.println(n+" is positive value");
  }
}
