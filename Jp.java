public class Jp{
  public static void main(String[] args){
    int i,k,j;
    for(i=1;i>0;i--){
      System.out.print(" ");
      for(j=1;j<=11;j++){
        String r=(j==6||j==7||j==9||j==10)?" ":"*";
        System.out.print(r);
      }
      System.out.println();
    }
    for(i=1;i>0;i--){
      System.out.print(" ");
      for(j=1;j<=11;j++){
      String r=(j==2||j==5||j==8||j==10)?"*":" ";
      System.out.print(r);
      }
      System.out.println();
    }
    for(i=1;i>0;i--){
      System.out.print(" ");
      for(j=1;j<=11;j++){
      String r=(j==2||j==5||j==8||j==9)?"*":" ";
      System.out.print(r);
      }
      System.out.println();
    }
    for(i=1;i>0;i--){
      System.out.print(" ");
      for(j=1;j<=11;j++){
      String r=(j==2||j==5||j==8||j==10)?"*":" ";
      System.out.print(r);
      }
      System.out.println();
    }
    for(i=1;i>0;i--){
      System.out.print(" ");
      for(j=1;j<=11;j++){
        String r=(j==6||j==7||j==9||j==10)?" ":"*";
          System.out.print(r);
      }
      System.out.println();
    }
  }
}
