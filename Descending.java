import java.util.*;
public class Descending{
  public static void main(String[] args){
    Integer a[]={23,22,15,9,2};
    Arrays.sort(a,Collections.reverseOrder());
    System.out.println(Arrays.toString(a));
  }
}
