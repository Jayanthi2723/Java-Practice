public class SumEven{
  public static void main(String[] args){
    int a[]={2,9,32,1,78,3,7,2},Even=0;
    for(int i=0;i<a.length;i++){
      if(a[i]%2==0){
        Even=Even+a[i];
      }
    }
    System.out.println(Even);
  }
}
