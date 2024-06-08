import java.util.Arrays;
public class SecondLargestInArrayExample1{
  public static int getSecondLargest(int[] a, int total){
  Arrays.sort(a);
  return a[total];
  }
public static void main(String args[]){
  int a[]={2,9,32,1,78,3,7,2};
  System.out.println("Second Largest: "+getSecondLargest(a,6));
  }
}
