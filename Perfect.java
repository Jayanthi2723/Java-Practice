public class Perfect{
  public static void main(String[] args){
    int n=28;
    long sum=0;
    int original=n;
    for(int i=1;i<=n/2;++i){
      if(n%i==0){
        sum=sum+i;
      }
    }
    if(original==sum)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}
