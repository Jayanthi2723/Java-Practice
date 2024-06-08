import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int z=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=5-i+1;j++){
                System.out.print((char)(z));
                z++;
            }
            System.err.println();
        }

    }
}
