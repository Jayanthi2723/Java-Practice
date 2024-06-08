public class Pattern9{
  public static void main(String[] args){
    int i,j,k,m,n,r,z;
    for(i=1;i<=4;i++){
      for(k=1;k<=4-i+1;k++){
        System.out.print(" ");
      }
      for(j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(z=1;z<=5;z++){
      System.out.print("*");
    }
    System.out.println();
    for(m=1;m<=4;m++){
      for(n=1;n<=m;n++){
        System.out.print(" ");
      }
      for(r=1;r<=4-m+1;r++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
