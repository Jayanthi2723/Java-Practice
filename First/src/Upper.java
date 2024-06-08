import java.util.Scanner;
public class Upper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        char[] ch=st.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z')
              ch[i]=(char)(ch[i]-32);
        }
        st=new String(ch);
        System.out.println(st);
    }
    
}
