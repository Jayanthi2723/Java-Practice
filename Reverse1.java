//import java.util.Arrays;
import java.util.*;
//import java.util.Collections;
public class Reverse1{
  public static void main(String[] args){
    Integer a[]={1,2,3,4};
    reverse(a);
    System.out.println(Arrays.toString(a));
  }
  static void reverse(Integer[] a) {
       Collections.reverse(Arrays.asList(a));
   }
}
