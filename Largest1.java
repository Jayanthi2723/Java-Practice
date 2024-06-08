public class Largest1{
  public static void main(String[] args){
    int a[]={2,9,32,1,78,3,7,2},max=0,second=0;
    for(int i=0;i<a.length;i++){
      if(max<a[i]){
        second=max;
        max=a[i];
      }
      if(a[i]<second && a[i]!=max){
        a[i]=second;
        second=a[i];
      }
    }
    System.out.println(second);
  }
}
