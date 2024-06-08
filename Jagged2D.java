import java.util.Scanner;
public class Jagged2D{
  public static void main(String[] args){
    int[][] a=new int[2][];
    a[0]=new int[3];
    a[1]=new int[5];
    Scanner scan=new Scanner(System.in);
    for(int i=0;i<=a.length-1;i++){
      for(int j=0;j<=a[i].length-1;j++){
        System.out.println("Enter the age of student from classroom "+i+"student "+j);
        a[i][j]=scan.nextInt();
      }
    }
    System.out.println("the ages are");
    for(int i=0;i<=a.length-1;i++){
      for(int j=0;j<=a[i].length-1;j++){
        System.out.println(a[i][j]);
      }
    }
  }
}
