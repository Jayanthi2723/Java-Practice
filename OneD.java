import java.util.Scanner;
public class OneD{
  public static void main(String[] args){
    int a[]=new int[5];
    Scanner scan=new Scanner(System.in);
    for(int i=0;i<=a.length-1;i++){
      System.out.println("enter the student age");
      a[i]=scan.nextInt();
    }
    System.out.println("the ages are:");
    for(int i=0;i<=a.length-1;i++){
      System.out.println(a[i]);
    }
  }
}
