public class Lcm{
  public static void main(String[] args){
    int n=10,m=20,gcd=1;
    for(int i=1;i<=n&&i<=m;i++){
      if(n%i==0&&m%i==0)
      gcd=i;
    }
    int lcm=(n*m)/gcd;
    System.out.println(lcm);
  }
}
