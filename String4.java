import java.lang.String;
class String4{
  public static void main(String[] args) {
    String s1="car";
    String s2=new String("CAR");
    String s3="CAR";
    String s4=new String("bike");
    System.out.println(s2==s3);
    System.out.println(s2.equals(s3));
    System.out.println(s1.equals(s3));
  }
}
