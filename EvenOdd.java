public class EvenOdd{
  public static void main(String[] args){
    int N=8,a[]={2,9,32,1,78,3,9,2},Even=0,odd=0;
    System.out.println(N);
    for(int i=0;i<N;i++){
      System.out.print(a[i]+" ");
      if(a[i]%2==0){
        Even++;
      }
    }
    System.out.println();
    System.out.println(Even);
    for(int i=0;i<N;i++){
      if(a[i]%2!=0){
        odd++;
      }
    }
    System.out.println(odd);
  }
}
