public class AreaCircle{
  public static void main(String[] args){
    double d=area(18);
    System.out.println(d);
    System.out.println(area(18));
  }
  public static double area(double r){
    double pi=3.142;
    //double area=pi*r*r;
    return pi*r*r;
  }
}
