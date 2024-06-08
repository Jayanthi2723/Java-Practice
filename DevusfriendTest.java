import java.util.*;
public class Devus{
  public static void main(String[] args){
    int n=5,count=0;
    int ar[]={3,2,1,3,4};
    Arrays.sort(ar);
    for(int i=0;i<ar.length-1;i++){
      if(ar[i]!=ar[i+1]){
        count++;
      }
    }
    System.out.println(count);
  }
}
