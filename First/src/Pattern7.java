import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int y=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=5-i+1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1)
                  System.out.print("*");
                else 
                  System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=y;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=11-2*i;j++){
                if(j==1||j==11-2*i)
                  System.out.print("*");
                else 
                  System.out.print(" ");
            }
            System.out.println();
        }
    }
}
