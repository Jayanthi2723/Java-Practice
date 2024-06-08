import java.util.Scanner;
public class Compound{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int p,r,t,n;
    double z;
    System.out.println("Enter the Pricipal amount:");
    p=scan.nextInt();
    System.out.println("Enter the Annual interest:");
    r=scan.nextInt();
    System.out.println("Enter the Time peroid:");
    t=scan.nextInt();
    System.out.println("Enter the number of times:");
    n=scan.nextInt();
    z=p*(Math.pow((1+r/n),(n*t)))-p;
    System.out.format("%.2f",z);
  }
}
