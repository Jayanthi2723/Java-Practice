import java.util.*;
public class Transpose{
  public static void main(String[] args){
    Integer a[][]={{1,2,3,4},{5,6,1,2},{5,3,4,2},{8,6,9,2}};
    int transpose[][]=new int[4][4];
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        transpose[j][i]=a[i][j];
      }
    }
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        System.out.print(transpose[i][j]);
      }
      System.out.println();
    }
  }
}
