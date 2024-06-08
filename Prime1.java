public class Prime1{
  public static void main(String[] args){
    int n=98,flag=0;
    if(n==0||n==1){
      System.out.println("NO");
    }else{
      for(int i=2;i<=n/2;i++){
        if(n%i==0){
          System.out.println("NO");
          flag=1;
          break;
        }
      }
      if(flag==0){
        System.out.println("YES");
      }
    }
  }
}
