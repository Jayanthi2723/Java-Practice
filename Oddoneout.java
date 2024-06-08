public class Oddoneout{
  public static void main(String[] args){
    int arr[]={1,3,5,9},n=5;
    int s=n*(2+(n-1)*2)/2;
    //System.out.println(s);
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum=sum+arr[i];
    }
    //System.out.println(sum);
    int mt=s-sum;
    System.out.println(mt);
  }
}
