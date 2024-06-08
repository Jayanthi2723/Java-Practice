public class Min{
  public static void main(String[] args){
    int a[]={23,22,15,9,2},min=23;
    for(int i=0;i<a.length;i++){
      if(a[i]<min){
        min=a[i];
      }
    }
    System.out.println(min);
  }
}
