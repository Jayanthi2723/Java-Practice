public class SumOdd{
  public static void main(String[] args){
    int a[]={2,9,32,1,78,3,7,2},odd=0;
    for(int i=0;i<a.length;i++){
      if(a[i]%2!=0){
        odd=odd+a[i];
      }
    }
    System.out.println(odd);
  }
}
