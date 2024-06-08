class Amstrong{
  public static void main(String[] args){
    int n=371,rem=0,ams=0,org=n;
    for(int i=1;i<=n;i++){
        rem=n%10;
        ams=ams+(rem*rem*rem);
        n=n/10;
    }
    if(ams==org)
      System.out.println("Amstrong");
    else
      System.out.println("Not an Amstrong");
  }
}
