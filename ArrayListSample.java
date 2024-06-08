import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class ArrayListSample{
  public static void main(String[] args){
    List<Integer> list = Arrays.asList(23,22,15,9,2);
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);
  }
}
