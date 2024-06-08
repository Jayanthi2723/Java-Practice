import java.util.Scanner;
class Calculator{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no to calculate");
    int x=sc.nextInt();
    int y=sc.nextInt();
    System.out.println("enter symbol to calculate");
    char ch=sc.next().charAt(0);
    switch(ch){
      case '+':System.out.println("Addition is "+(x+y));
               break;
      case '-':System.out.println("Substraction is "+(x-y));
               break;
      case '*':System.out.println("Multiplication is "+(x*y));
               break;
      case '/':System.out.println("Division is "+(x/y));
               break;
      case '%':System.out.println("Remainder is "+(x%y));
               break;
      default:
        System.out.println("Wrong choice!!");
    }
  }
}
