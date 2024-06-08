import java.util.*;
public class Diagonal{
  public static void main(String[] args){
    int a[][]={{1,4,2,6},{8,3,5,12},{55,8,5,8},{6,1,5,4}};
    int pd=0;
    for(int i=0;i<=a.length;i++){
      for(int j=0;i<=a.length;j++){
        System.out.println(a[i][j]);
      }
    }
    for(int i=0;i<=a.length;i++){
      for(int j=0;i<=a.length;j++){
        if(i==j){
          pd+=a[i][j];
        }
      }
    }
    System.out.println(Arrays.toString(a[i][j]));
  }
}
