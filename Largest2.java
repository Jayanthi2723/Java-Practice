public class Largest2{
  public static void main(String[] args){
    int a[]={1,2,3,4,5},max=0;
    for(int i=0;i<a.length;i++)
    {
      if(a[i]>max){
        max=a[i];
      }
    }
    System.out.println(max);
  }
}
