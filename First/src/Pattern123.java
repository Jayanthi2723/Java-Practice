import java.util.Scanner;
public class Pattern123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int z=97;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)z+" ");
                z++;
                j=z-1;
            }
            System.out.println();
        }
    }
}
