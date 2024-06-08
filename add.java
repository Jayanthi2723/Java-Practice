import java.util.Scanner;
public class main{
   public static void main(String[] arg)
   {
    int x,y;
    Scanner sc=new Scanner(System.in);
    System.out.print("please give first number:");
    x=sc.nextInt();
    System.out.print("please give second number:");
    y=sc.nextInt();
    while(y!=0){
        int temp=x&y;
        y=temp<<1;
    }
    System.out.print("sum="+x);
    System.out.print("\n");
    }
}