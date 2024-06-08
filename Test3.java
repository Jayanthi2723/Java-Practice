import java.util.ArrayList;
import java.util.Collections;
class Test3{
  public static void main(String[] args) {
    ArrayList al=new ArrayList();
    al.add(new Certificate(21334,"jaya",63.98));
    al.add(new Certificate(2188,"laya",63.98));
    al.add(new Certificate(233234,"maya",83.08));
    al.add(new Certificate(210975,"raya",63.38));
    Collections.sort(al);
    System.out.println(al);
  }
}
