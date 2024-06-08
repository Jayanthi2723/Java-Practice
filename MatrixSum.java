public class MatrixSum{
  public static void main(String[] args){
    int a[][]={{1,5,8},{6,52,7},{-1,4,0}};
    int b[][]={{1,-2,3},{7,5,3},{4,5,3}};
    int sum=0;
    for(int i=0;i<a.length;i++){
      for(int j=0;j<b.length;j++){
        sum=a[i][j]+b[i][j];
        System.out.print(sum+" ");
      }
      System.out.println();
    }
  }
}
