public class Second{
  public static void main(String[] args){
    int a[]={2,9,32,1,78,3,7,2},temp=0;
    for(int i=0;i<=a.length;i++){
      for(int j=0;j<=a.length;j++){
        if(a[i]>a[j]){
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    System.out.println(temp);
  }
}
