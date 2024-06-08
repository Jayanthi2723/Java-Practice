public class Tap28{
  public static void main(String[] args){
    int P=10;
    int r=20;
    int t=2;
    int n=1;
    //double d=P*(Math.pow((1+r/n),(n*t)))-P;
    System.out.format("%.2f",P*(Math.pow((1+r/n),(n*t)))-P);
  }
}
