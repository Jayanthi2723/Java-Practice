import java.util.*;
public class Square{
  public static void main(String[] args){
    int a[]={1,2,3,4};
    int arr[]=new int [a.length];
    for(int i=0;i<a.length;i++){
       arr[i]=a[i]*a[i];
    }
    System.out.println(Arrays.toString(arr));
  }
}
