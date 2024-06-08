public class Floor{
  public static void main(String[] args){
    int a[]={23,45,67,89,90,95},mid=0;
    int l=0,h=a.length-1,key=73;
    while(l<=h){
      mid=(l+h)/2;
      if(key==a[mid])
        System.out.println(a[mid]);
      else if(key<a[mid])
        h=mid-1;
      else
        l=mid+1;
    }
    System.out.println(a[h]);
  }
}
