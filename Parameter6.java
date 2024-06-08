class Parameter6{
  public static void main(String[] args){
    xylem(1234);
  }
  public static void xylem(int num){
    int n=num,outSum=0,inSum=0;
    while(n!=0){
      if(n==num || n<10){
        outSum+=n%10;
      }
      else{
        inSum+=n%10;
      }
      n=n/10;
    }
    if(outSum==inSum){
      System.out.println("xylem");
    }
    else{
      System.out.println("phloem");
    }
  }
}
