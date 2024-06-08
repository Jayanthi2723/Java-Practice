public class NonZero1{
  public static void main(String[] args){
    int a[]={23,22,0,9,2},N=5,count=0;
    System.out.println(N);
    for(int i=0;i<N;i++){
      if(i>0){
        count++;
      }
      System.out.print(a[i]+" ");
    }
    System.out.println();
    System.out.println(count);
  }
}
