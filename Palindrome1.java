public class Palindrome1{
  public static void main(String[] args){
    palindrome(1221);
    xylem(1214);
  }
  public static void palindrome(int num){
    int rev=0;
    int org=num;
    for(;num!=0;num=num/10){
      int rem=num%10;
      rev=rev*10+rem;
    }
    if(rev==org)
      System.out.println("Palindrome");
    else
      System.out.println("Not a Palindrome");
  }
  public static void xylem(int num){
    int n=num,Outsum=0,Insum=0;
    while(n!=0){
      if(n==num || n<10)
        Outsum=Outsum+n%10;
      else
        Insum=Insum+n%10;
        n=n/10;
    }
    if(Outsum==Insum)
      System.out.println("Xylem");
    else
      System.out.println("Phloem");
  }
}
