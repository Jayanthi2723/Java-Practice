import java.util.Scanner;
class BiggestDouble{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double d1=sc.nextDouble();
    double d2=sc.nextDouble();
    double d3=sc.nextDouble();
    double d4=sc.nextDouble();
    if(d1>d2&&d1>d3&&d1>d4)
     System.out.println(d1+" is greatest");
    else if(d2>d3&&d2>d4)
     System.out.println(d2+" is greatest");
    else if(d3>d4)
     System.out.println(d3+" is greatest");
    else
     System.out.println(d4+" is greatest");
  }
}
