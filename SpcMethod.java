import java.util.Scanner;
class SpcMethod{
  public static boolean isSpecial(int n){
      int d1=n/10;
      int d2=n%10;
      int spc=d1+d2+d1*d2;
      if(spc==n)
       return true;
      else
       return false;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean rs=isSpecial(n);
    if(rs==true)
     System.out.println(n+" is special two digit number");
    else
     System.out.println(n+" is not a special two digit number");
  }
}
