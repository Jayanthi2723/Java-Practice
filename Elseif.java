public class Elseif{
  public static void main(String[] args){
    int a=20;
    if(a>0 && a<50){
      System.out.println("a is inbetween 0 to 50");
    }
    else if(a>50 && a<100){
      System.out.println("a is inbetween 50 t0 100");
    }
    else{
      System.out.println("a is greater than 100");
    }
  }
}
