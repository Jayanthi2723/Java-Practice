class Parameter5{
  public static void main(String[] args){
    palindrome(1221);
    palindrome(4546);
  }
  public static void palindrome(int num){
    int rev=0,org=num;
    for(;num!=0;num=num/10){
      int last=num%10;
      rev=rev*10+last;
    }
    if(rev==org)
      System.out.println("palindrome");
    else
      System.out.println("not a palindrome");
  }
}
