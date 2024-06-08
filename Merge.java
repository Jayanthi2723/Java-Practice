import java.util.Arrays;
public class Merge{
  public static void main(String[] args){
    int a[]={78,43,8,2};
    int b[]={321,122,99,81};
    int al=a.length;
    int bl=b.length;
    int[] result=new int[bl+al];
    System.arraycopy(b,0,result,0,bl);
    System.arraycopy(a,0,result,al,bl);
    System.out.println(Arrays.toString(result));
  }
}
