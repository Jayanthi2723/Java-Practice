import java.util.ArrayList;
//
import java.util.Collections;
class ArrayList6{
  public static void main(String[] args) {
    ArrayList al=new ArrayList();
    al.add(2);
    al.add(5);
    al.add(1);
    al.add(9);
    Collections.sort(al);
    // ListIterator li=al.ListIterator();
    // System.out.println(li.next());
    System.out.println(al);
  }
}
