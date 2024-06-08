public class Pattern10{
  public static void main(String[] args){
    int i,k,j;
    for(i=5;i>0;i--){
      for(k=0;k<5-i;k++){
        System.out.print(" ");
      }
      for(j=0;j<2*i-1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
