public class Hallowtriangle{
  public static void main(String[] args){
    int i,k,j;
    for(i=1;i<=5;i++){
      for(k=1;k<=5-i+1;k++){
        System.out.print(" ");
      }
      for(j=1;j<=2*i-1;j++){
        if(i==1||i==5||j==1||j==2*i-1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}