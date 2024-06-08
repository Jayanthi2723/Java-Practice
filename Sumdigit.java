public class Sumdigit{
  public static void main(String[] args){
    int n=123,sum=0;
    for(sum=0;n!=0;n=n/10){
      sum=sum+n%10;
    }
    System.out.println(sum);
  }
}
