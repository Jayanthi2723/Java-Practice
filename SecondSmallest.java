public class SecondSmallest{
  public static void main(String[] args){
    int min1=0,min2=0;
    int a[]={34,12,56,22,77,23};
    if(a[0]<a[1]){
      min1=a[0];
      min2=a[1];
    }
    else{
      min1=a[1];
      min2=a[0];
    }
    for(int i=2;i<a.length;i++){
      if(a[i]<min1){
        min2=min1;
        min1=a[i];
      }
      if(a[i]<min2){
        min2=a[i];
      }
    }
    System.out.println(min2);
  }
}
