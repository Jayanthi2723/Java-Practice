public class Numpattern{
  public static void main(String[] args){
    int i,j,k,num=0;
    for(i=1;i<=5;i++){
      for(k=1;k<=5;k++){
        System.out.print(" ");
      }
      for(j=1;j<=i;j++){
        System.out.print(num+" ");
        num++;
      }
      System.out.println();
    }
  }
}
