import java.util.Scanner;
class Subject{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int n3=sc.nextInt();
    int n4=sc.nextInt();
    if(n1<35||n2<35||n3<35||n4<35)
     System.out.println("Fail");
    else
     System.out.println("Pass");
  }
}
