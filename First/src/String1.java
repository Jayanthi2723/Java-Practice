import java.util.Scanner;

import java.util.Scanner;
class String1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch>='0' && ch<='9'){
            sum=sum+((int)ch-48);
           }
        }
        System.out.println(sum);
    }
}