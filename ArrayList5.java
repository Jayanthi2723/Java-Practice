import java.util.ArrayList;
import java.util.Iterator;
class ArrayList5{
  public static void main(String[] args) {
    ArrayList al=new ArrayList();
    al.add("maya");
    al.add("laya");
    al.add("jaya");
    Iterator i=al.iterator();
    System.out.println(i.hasNext());
    System.out.println(i.next());
    while(i.hasNext()){
      System.out.println(i.next());
    }
  }
}
