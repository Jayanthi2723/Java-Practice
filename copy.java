import java.util.Arrays;
public class Copy{
  public static void main(String[] args){
    int arr[]={78,43,8,2};
    int arr1[]=new int [arr.length];
    for(int i=0;i<=arr.length;i++){
      arr1[i]=arr[i];
    }
    for(int i=0;i<=arr.length;i++){
      System.out.println(arr1);
    }
    System.out.println(arr1);
  }
}
