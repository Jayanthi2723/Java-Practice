import java.util.Scanner;
class ValidDate{
  public static String isValid(int dd,int mm,int yy){
    if(dd<1||dd>31||mm<1||mm>12||yy<0)
     return "Invalid";
    else if((mm==4||mm==6||mm==9||mm==11)&&dd>31)
     return "Invalid";
    else if(mm==2&&dd>29)
     return "Invalid";
    else if((yy%4==0&&yy%100!=0||yy%400==0)==false&&mm==2&&dd>28)
     return "Invalid";
    else
     return "valid";
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int dd=sc.nextInt();
    int mm=sc.nextInt();
    int yy=sc.nextInt();
    System.out.println(isValid(dd,mm,yy));
  }
}
