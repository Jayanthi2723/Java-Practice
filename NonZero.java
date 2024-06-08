import java.util.Scanner;
public class NonZero{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N,count=0,Num;
    System.out.println("Enter the No of elements");
    N=scan.nextInt();
    System.out.println("Enter the "+N+" elemets:");
    Num=scan.nextInt();
    for(int i=1;i<N;i++){
      if(i>0){
        count++;
      }
      //else{
        //count--;
      //}
    }
    System.out.println(count);
  }
}
