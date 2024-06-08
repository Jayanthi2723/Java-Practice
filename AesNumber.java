public class AesNumber{
  public static void main(String[] args){
    int n=5,count=0;
    for(int i=1;i<=n;i++){
      if(n%i==0){
        count++;
      }
    }
    if(count==4){
      System.out.println("AES");
    }
    else{
      System.out.println("Not an AES");
    }
  }
}
