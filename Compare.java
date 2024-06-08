import java.util.Arrays;
class Compare{
  public static void main(String[] args) {
    Product1 c[]=new Product1[3];
    c[0]=new Product1(1,"jaya",56);
    c[1]=new Product1(2,"laya",76);
    c[2]=new Product1(3,"maya",89);
    Arrays.sort(c);
    for(int i=0;i<c.length;i++){
      System.out.println(c[i].price);
    }
  }
}
