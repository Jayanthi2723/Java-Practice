import java.util.Scanner;
public class Count2{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N,count=0;
    System.out.println("Enter the value of N");
    N=scan.nextInt();
    int Num;
    System.out.println("Enter the "+N+"elements");
    Num=scan.nextInt();
    for(int i=0;i<N;i++){
      count++;
    }
    System.out.println(count);
  }
}
