public class Leap{
  public static void main(String[] args){
    int l=2012;
    boolean leap=false;
    if(l%4==0 && l%100==0 && l%400==0){
      leap=true;
    }
    else {
      leap=false;
   }
   if(!leap)
     System.out.println("YES");
   else
     System.out.println("NO");
 }
}
