import java.lang.String;
class String3{
  public static void main(String[] args) {
    String s1=new String("sheela");
    String s2=new String("laila");
    String s3="mala";
    String s4="mala";
    String s5=new String("laila");
    System.out.println(s2);
    System.out.println(s5);
    System.out.println(s2==s5);
    System.out.println(s2.equals(s5));
    System.out.println(s3==s4);
  }
}
