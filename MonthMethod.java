import java.util.Scanner;
class MonthMethod{
  public static String isMonth(int n){
    String[] s={"jan","Feb","mar","Apr","may","jun","july","aug","sep","oct","nov","dec"};
    String r="";
    if(n>0&&n<13)
      r=s[n-1];
    return  r;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(isMonth(n));
  }
}
