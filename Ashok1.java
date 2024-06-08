public class Program{
  public static void main(String args[]){
    String str="Jayanthi";
    String s1="";
    for(int  i=0; i<str.length()-1;i+=2){
      String s=str.substring(i,i+2);
      System.out.println(s);
      s1+=s;
    }
    System.out.println(s1);
  }
}
