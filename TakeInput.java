import java.util.Scanner;
public class TakeInput{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the first number");
    int a=scan.nextInt();
    System.out.println("Second the second number");
    int b=scan.nextInt();
    int c=a+b;
    System.out.println(c);
  }
}
