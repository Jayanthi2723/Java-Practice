import  java.util.Scanner;
class DimOfCurrency{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int amt=sc.nextInt();
    System.out.println("2000rs is "+amt/2000);
    amt=amt%2000;
    System.out.println("500rs is "+amt/500);
    amt=amt%500;
    System.out.println("200rs is "+amt/200);
    amt=amt%200;
    System.out.println("100rs is "+amt/100);
    amt=amt%100;
    System.out.println("50rs is "+amt/50);
    amt=amt%50;
    System.out.println("20rs is "+amt/20);
    amt=amt%20;
    System.out.println("10rs is "+amt/10);
    amt=amt%10;
    System.out.println("5rs is "+amt/5);
    amt=amt%5;
    System.out.println("2rs is "+amt/2);
    amt=amt%2;
    System.out.println("1rs is "+amt);
    if(amt==0)
     
  }
}
