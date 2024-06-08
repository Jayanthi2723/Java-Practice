public class Prime{
  public static void main(String[] args){
    int i,m=29;
    boolean flag=false;
    for(i=2;i<=m/2;i++){
      if(m%i==00){
        flag=true;
        break;
      }
    }
      if(!flag)
        System.out.println("YES");
      else
        System.out.println("NO");
  }
}
