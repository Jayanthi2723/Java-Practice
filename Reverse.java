public class Reverse{
  public static void main(String[] args){
    int i=12345,rev=0;
    for(;i!=0;i=i/10){
        int r=i%10;
        rev=rev*10+r;
    }
    System.out.println(rev);
  }
}
