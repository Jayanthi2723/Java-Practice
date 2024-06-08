import java.util.ArrayList;
class ArrayList4{
  public static void main(String[] args) {
    ArrayList al=new ArrayList();
    al.add(12);
    al.add("mala");
    al.add(null);
    al.add("sheela");
    for(int i=0;i<al.size();i++){
      System.out.println(al.get(i));
    }
    System.out.println(al.get(2));
  }
}
