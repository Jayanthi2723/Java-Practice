public class SpanArray{
  public static void main(String[] args){
    int a[]={1,5,3,2,8,9},max=1,min=1;
    for(int i=1;i<a.length;i++){
      if(max<a[i]){
        max=a[i];
      }
      if(min>a[i]){
        min=a[i];
      }
    }
    System.out.println(max-min);
  }
}
