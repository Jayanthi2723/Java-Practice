class Pattern11{
  public static void main(String[] args) {
    int n=5;
    for(int i=1;i<6;i++){
      for(int j=1;j<6;j++){
        if(i==1||i==5||j==1||j==5||(i==j && i<=n/2+1))
          System.out.print("*");
        else if(i==1&&j==2)
           System.out.print(" ");
        else if(i==2&&j==4)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}
