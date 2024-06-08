public class Reverse3{
  public static void main(String[] args){
    reverse(5674);
  }
  public static void reverse(int num){
      for(;num!=0;num=num/10){
        int rev=0;
        int r=num%10;
        rev=rev*10+r;
        System.out.print(rev);
      }
      //System.out.println(rev);
  }
}
