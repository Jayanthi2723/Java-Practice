import java.util.ArrayList;
class ArrayList2{
  public static void main(String[] args) {
    ArrayList al=new ArrayList();
    al.add(3);
    al.add("mala");
    al.add(null);
    ArrayList al1=new ArrayList();
    al1.add(4);
    al1.add("sheela");
    al1.add(null);
    System.out.println(al);
    System.out.println(al1);
    al.addAll(al1);
    System.out.println(al);
    al.removeAll(al1);
    System.out.println(al);
    // al.retainAll(al1);
    // System.out.println(al);
    al.addAll(1,al1);
    System.out.println(al);
    al.retainAll(al1);
    System.out.println(al);
  }
}
