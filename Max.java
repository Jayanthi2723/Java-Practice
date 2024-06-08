public class Max{
  public static void main(String[] args){
    int a[]={1,4,5,6,3,89},max=1;
    for(int i=0;i<a.length;i++){
      if(a[i]>max){
        max=a[i];
      }
    }
    System.out.println(max);
  }
}
