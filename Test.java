import java.util.Scanner;
class UserInp{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n1=sc.nextInt();
    System.out.println("enter a another number");
    int n2=sc.nextInt();
    if(n1>n2)
      System.out.println(n1+"is greatest number");
    else
      System.out.println(n2+"is greatest number");
  }
}
