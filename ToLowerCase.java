import java.util.Scanner;
class ToLowerCase{
  static String toLowerCase(String s){
    String t=" ";
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      if(c>='A' && c<='Z'){
        t=t+(char)(c+32);
      }else{
        t=t+c;
      }
    }
    return t;
  }
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String s=scan.nextLine();
    System.out.println(toLowerCase(s));
  }
}
