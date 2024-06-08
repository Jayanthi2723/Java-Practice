public class Power{
  public static void main(String[] args){
    int p=power(2,2);
    System.out.println(p);
    System.out.println(power(2,3));
  }
  public static int power(int m,int n){
    int r=1;
    for(int i=1;i<=n;i++){
      r=m*r;
    }
    return r;
  }
}
