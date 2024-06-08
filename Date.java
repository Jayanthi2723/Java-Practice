import java.util.Scanner;
class Date{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int dd=sc.nextInt();
    int mm=sc.nextInt();
    int yy=sc.nextInt();
    if(dd<1||dd>31||mm<1||mm>12||yy<0)
     System.out.println("Invalid date");
    else if((mm==4||mm==6||mm==9||mm==11)&&dd>30)
     System.out.println("Invalid date");
    else if(mm==2&&dd>29)
     System.out.println("Invalid date");
    else if((yy%4==0&&yy%100!=0||yy%400==0)==false&&mm==2&&dd>28)
     System.out.println("Invalid date");
    else
     System.out.println("Valid date");
  }
}
