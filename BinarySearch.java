import java.util.*;
public class BinarySearch{
  public static void main(String[] args){
    int a[]={12,7,34,45,23,89,43},key=34;
    Arrays.sort(a);
    int l=0,h=a.length-1,mid=0;
    while(l<=h){
      mid=(l+h)/2;
      if(key==a[mid]){
        System.out.println(mid);
        break;
      }
      else if(key<a[mid]){
        h=mid-1;
        l=l;
      }
      else
      {
        l=mid+1;
        h=h;
      }
      System.out.println(-1);
      break;
    }
  }
}
