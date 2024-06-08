public class Palindrome{
  public static void main(String[] args){
    int i=9889,rev=0;
    int Original=i;
    for(;i!=0;i=i/10){
        int r=i%10;
        rev=rev*10+r;
    }
    if(Original==rev)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}
