import java.util.Arrays;
public class MaxMin{
  public static void main(String[] args){
    int a[]={13,5,11,9,7};
    Arrays.sort(a);
    int MinSum=0;
    for(int i=0;i<a.length-1;i++){
      MinSum+=a[i];
    }
    System.out.print(MinSum+" ");
    int MaxSum=0;
    for(int i=1;i<a.length;i++){
      MaxSum+=a[i];
    }
    System.out.println(MaxSum);
  }
}
