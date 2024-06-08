import java.util.Scanner;
public class bank{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String Name,AccType,Email,IFSC;
    System.out.println("Enter the account holders name:");
    Name=scan.next();
    long AccNum,PhNo,Aadhar;
    System.out.println("Enter the account number:");
    AccNum=scan.nextLong();
    System.out.println("Enter the Type of the Account:");
    AccType=scan.next();
    System.out.println("Enter the Email Address");
    Email=scan.next();
    System.out.println("ENter the PhNo:");
    PhNo=scan.nextLong();
    System.out.println("Enter the IFSC code of the bank:");
    IFSC=scan.next();
    System.out.println("Enter the Aadhar number:");
    Aadhar=scan.nextLong();
    System.out.println(Name);
    System.out.println(AccType);
    System.out.println(Email);
    System.out.println(IFSC);
    System.out.println(AccNum);
    System.out.println(PhNo);
    System.out.println(Aadhar);
  }
}
