import java.util.Scanner;
class Bmi{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the weight of the body");
    double w=sc.nextDouble();
    System.out.println("enter the height of the body");
    double h=sc.nextDouble();
    double bmi=w/(h*h);
    System.out.println(bmi);
    // if(bmi<15)
    //  System.out.println("Need to work hard");
    // else if(bmi>=15 && bmi<=22)
    //  System.out.println("great");
    // else
    //  System.out.println("need to loose weight");
    String s=(bmi<15)?"Need to work hard":(bmi>=15&&bmi<=22)?"great":"need to loose weight";
    System.out.println(s);
  }
}
