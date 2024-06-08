import java.util.Scanner;
public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sp=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' ')
              sp++;
        }
        System.out.println(sp);
    }
    
}
