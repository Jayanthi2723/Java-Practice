import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=5-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
