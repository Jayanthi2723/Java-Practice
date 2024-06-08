import java.util.Scanner;
public class Jagged3D1{
  public static void main(String[] args){
    int a[][][]=new int[3][][];
    a[0]=new int[3][];
    a[1]=new int[2][];
    a[2]=new int[2][];
    a[0][0]=new int[2];
    a[0][1]=new int[3];
    a[0][2]=new int[2];
    a[1][0]=new int[1];
    a[1][1]=new int[2];
    a[2][0]=new int[2];
    a[2][1]=new int[1];
    Scanner scan=new Scanner(System.in);
    for(int i=0;i<=a.length-1;i++){
      for(int j=0;j<=a[i].length-1;j++){
        for(int k=0;k<=a[i][j].length-1;k++){
          System.out.println("enter the age of school "+i+"classroom "+j+"student "+k);
          a[i][j][k]=scan.nextInt();
        }
      }
    }
    System.out.println("The ages are:");
    for(int i=0;i<=a.length-1;i++){
      for(int j=0;j<=a[i].length-1;j++){
        for(int k=0;k<=a[i][j].length-1;k++){
          System.out.println(a[i][j][k]);
        }
      }
    }
  }
}
