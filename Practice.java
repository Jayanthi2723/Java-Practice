public class Practice{
  public static void main(String[] args){
    int i,k,j;
    for(i=1, j=1; i>0 && j<=11; j=(j<=11?j+1:j)){
      String r=(j==6||j==7||j==9||j==10)?" ":"*";
      System.out.print(r);
    }
    System.out.println();
    for(i=1, j=1; i>0 && j<=11; j=(j<=11?j+1:j)){
      String r=(j==2||j==5||j==8||j==10)?"*":" ";
      System.out.print(r);
    }
    System.out.println();
    for(i=1, j=1; i>0 && j<=11; j=(j<=11?j+1:j)){
      String r=(j==2||j==5||j==8||j==9)?"*":" ";
      System.out.print(r);
    }
    System.out.println();
    for(i=1, j=1; i>0 && j<=11; j=(j<=11?j+1:j)){
      String r=(j==2||j==5||j==8||j==10)?"*":" ";
      System.out.print(r);
    }
    System.out.println();
    for(i=1, j=1; i>0 && j<=11; j=(j<=11?j+1:j)){
      String r=(j==6||j==7||j==9||j==10)?" ":"*";
      System.out.print(r);
    }
    System.out.println();
  }
}
