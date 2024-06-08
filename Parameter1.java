class Parameter1{
  public static void main(String[] args){
    System.out.println(reverse(2345));
    System.out.println(reve(3456));
    int res=reverse(967896);
    System.out.println(res);
  }
  public static int reverse(int num){
    int rev=0;
    for(;num!=0;num=num/10){
      int last=num%10;
      rev=rev*10+last;
    }
    return rev;
  }
  public static int reve(int no){
    int fin=0;
    while(no!=0)
    {
      int mod=no%10;
      fin=fin*10+mod;
      no=no/10;
    }
    return fin;
  }
}
