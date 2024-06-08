class AshokBro{
  public static void main(String[] args) {
    for(int i=0;i<=5;i++){
      int x=i;
      int k=4;
      for(int j=0;j<i;j++){
          System.out.print(x+" ");
            x=x+k;
            k--;
            if(j==2||j==4){
              for(int m=9;m<i;m--){
                System.out.print(m+" ");
              }
            }


      }
      System.out.println();
    }
  }
}
