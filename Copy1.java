import java.util.*;
public class Copy1{
  public static void main(String[] args){
    int arr[]={3,2,1,9,32,99,6};
    int[] arr1=Arrays.copyOf(arr,arr.length);
    System.out.println(Arrays.toString(arr1));
  }
}
