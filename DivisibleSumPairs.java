public class DivisibleSumPairs{
  public static void main(String[] args){
    int k=3,n=0;
    int a[]={1,3,2,6,1,2};
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        if((a[i]+a[j])%k==0){
          n++;
        }
      }
    }
    System.out.println(n);
  }
}
