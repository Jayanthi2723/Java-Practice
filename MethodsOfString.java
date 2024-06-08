import java.lang.String;
class MethodsOfString{
  public static void main(String[] args) {
    String s1="sheela";
    String s2="SHEELA";
    System.out.println(s1.equals(s2));//false values will be compared
    System.out.println(s1.equalsIgnoreCase(s2));//true compare two stringd without considering the case
    System.out.println(s1.toUpperCase());
    System.out.println(s2.toLowerCase());
    System.out.println(s1.charAt(1));
    System.out.println(s1.charAt(5));
    System.out.println(s1.length());
    System.out.println(s1.substring(2));
    System.out.println(s1.substring(4));
    System.out.println(s1.substring(2,4));
    String s3="Hello World";
    System.out.println(s1.indexOf('s'));
    System.out.println(s3.indexOf(5,'r'));
    System.out.println(s3.lastIndexOf('l'));
    String s4="  sheela  ";
    System.out.println(s4);
    System.out.println(s4.length());
    s4=s4.trim();
    System.out.println(s4.length());
    System.out.println(s4.trim());
    System.out.println(s3.concat(s1));
    String s5="Hello:World@geek@for@geeks";
    String s6[]=s5.split(":");
    for(String a:s6)
       System.out.println(a);
  }
}
