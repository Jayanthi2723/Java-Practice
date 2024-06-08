import java.util.Scanner;
class LeapMethod{
  public static String isLeap(int y){
    if(y%4==0&&y%100!=0||y%400==0)
     return "leap year";
    else
     return "Not a leap year";
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int y=sc.nextInt();
    System.out.println(isLeap(y));
  }
}
