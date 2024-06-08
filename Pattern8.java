public class Pattern8{
  public static void main(String[] args){
    int i,j,m,n;
    for(i=1;i<=5;i++){
      for(j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(m=1;m<=4;m++){
      for(n=1;n<=4-m+1;n++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
