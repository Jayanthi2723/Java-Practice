public class Trianglespace{
  public static void main(String[] args){
    int i,k,j;
    for(i=1;i<=5;i++){
      for(k=1;k<=5-i+1;k++){
        System.out.print(" ");
      }
      for(j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
