public class NumberOfAES{
  public static void main(String[] args){
    aesNumber(5);
    int l=1,r=20,aes=0;
    for(int i=l;i<=r;i++){
      if(aesNumber(i)==true){
        aes++;
      }
    }
    System.out.println(aes);
  }
  public static boolean aesNumber(int n){
    int count=0;
    for(int i=1;i<=n;i++){
      if(n%i==0){
        count++;
      }
    }
    if(count==4){
      return true;
    }
    else{
      return false;
    }
  }
}
