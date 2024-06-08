public class Xylem{
  public static void main(String[] args){
    int num=1234;
    int n=num,sum=0,sum1=0;
    while(n!=0)
    {
      if(n==num || n<10){
        sum=sum+n%10;
      }
      else{
        sum1=sum1+n%10;
        n=n/10;
      }
    }
    if(sum==sum1){
      System.out.println("xylem");
    }
    else{
      System.out.println("phloem");
    }
  }
}
