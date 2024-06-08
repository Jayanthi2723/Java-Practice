import java.util.Arrays;
class ArraysInter{
  public static void main(String[] args){
    int a[]={1,2,3,4,5,6};
    int a1[]={2,3,4,8,9,10};
    for(int i=0;i<a.length;i++){
      if(a[i]==a1[i]){
        System.out.println(i);
      }
    }
  }
}
