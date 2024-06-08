import java.util.Scanner;
public class ThreeD{
  public static void main(String[] args){
    int a[][][]=new int[2][3][5];
    Scanner scan=new Scanner(System.in);
    for(int i=0;i<=a.length-1;i++){
      for(int j=0;j<=a[i].length-1;j++){
        for(int k=0;k<=a[i][j].length-1;k++){
          System.out.println("Enter the age of school "+i+"classroom "+j+"Student "+k);
          a[i][j][k]=scan.nextInt();
        }
      }
    }
    System.out.println("the ages are:");
    for(int i=0;i<=a.length-1;i++){
      for(int j=0;j<=a[i].length-1;j++){
        for(int k=0;k<=a[i][j].length-1;k++){
          System.out.println(a[i][j][k]);
        }
      }
    }
  }
}
