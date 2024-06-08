public class Hallowrect{
  public static void main(String[] args){
    int i,k,j;
    for(i=1;i<=7;i++){
      for(k=1;k<=5;k++){
        System.out.print(" ");
      }
      for(j=1;j<=7;j++){
        if(i==1||i==7||j==1||j==7){
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
