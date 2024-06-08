public class Largest3{
  public static void main(String[] args){
    int a[][]={{1,4,2,6},{8,3,5,12},{55,8,5,8},{6,1,5,4}};
    int max=0;
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        if(max<a[i][j]){
          max=a[i][j];
        }
      }
    }
    System.out.println(max);
  }
}
