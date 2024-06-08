class Methods10{
  public static void main(String[] args){
    reverse(1234);
  }
  public static void reverse(int num){
    int rev=0;
    for(;num!=0;num=num/10){
      int last=num%10;
      rev=rev*10+last;
   }
    System.out.println(rev);
  }
}
