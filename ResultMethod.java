import java.util.Scanner;
class ResultMethod{
  public static String getResult(int m1,int m2,int m3,int m4){
    if(m1<35||m2<35||m3<35||m4<35)
     return "fail";
    double res=(m1+m2+m3+m4)/4.0;
    if(res>=85)
     return "Distinction";
    else if(res>=60)
     return "First class";
    else if(res>=50)
     return "second cls";
    return "pass";
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int m1=sc.nextInt();
    int m2=sc.nextInt();
    int m3=sc.nextInt();
    int m4=sc.nextInt();
    System.out.println("result is "+getResult(m1,m2,m3,m4));
  }
}
