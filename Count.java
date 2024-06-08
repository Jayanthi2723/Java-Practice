public class Count{
  public static void main(String[] args){
    int N[]={1,2,3,4,5};
    int count=0;
    System.out.println("Entered elements are:");
    for(int i:N){
      System.out.print(N[i]+" ");
      count++;
    }
    System.out.println("total number of elements in an array is:"+count);
  }
}
