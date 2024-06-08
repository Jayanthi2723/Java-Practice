import java.util.Scanner;
class EqualInt{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    if(n1==n2&&n1<0&&n2<0||n1==n2&&n1>0&&n2>0)
     System.out.println(n1+" and "+n2+" "+"are equal");
    else
     System.out.println(n1+" "+"and "+n2+" "+"are not equal");
  }
}
