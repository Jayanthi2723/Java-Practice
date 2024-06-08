public class Ceil{
  public static void main(String[] args){
    int a[]={12,34,56,78,90,95,97};
    int l=0,h=a.length-1,mid=0,key=94;
    while(l<=h){
      mid=(l+h)/2;
      if(key==a[mid])
        System.out.println(a[mid]);
      else if(key<a[mid])
        h=mid-1;
      else
        l=mid+1;
    }
    System.out.println(a[l]);
  }
}
