import java.util.*;
public class MatrixDiagonal{
  public static void main(){
  matrix();
  }
  public static void matrix()
  {
    int a[][]={{1,4,2,6},{8,3,5,12},{55,8,5,8},{6,1,5,4}};
    int principal_diagonal=0;
    for(int i=0;i<=a.length;i++){
      for(int j=0;j<=a.length;j++){
        if(i==j){
          principal_diagonal+=a[i][j];
        }
      }
    }
  }
}
