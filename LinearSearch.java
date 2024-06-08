import java.util.*;
public class LinearSearch{
  public static void main(String[] args){
    int n=60;
    int ar[]={20,30,10,50,40};
    Arrays.sort(ar);
    for(int i=0;i<ar.length;i++){
      if(n==ar[i]){
        System.out.println(i);
        break;
      }else{
        System.out.println(-1);
        break;
      }
    }
  }
}
