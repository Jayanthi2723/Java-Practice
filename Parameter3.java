class Parameter3{
  public static void main(String[] args){
    System.out.println(area(18));
    double d=area(18);
    System.out.println(d);
    System.out.println(power(2,3));
    int res=power(2,3);
    System.out.println(res);
  }
  public static double area(int r){
    double pi=3.142;
    return pi*r*r;
  }
  public static int  power(int m,int n){
    int r=1;
    for(int i=1;i<=n;i++){
      r=m*r;
    }
    return r;
  }
}
