class ArrayPrime{
  public static void main(String[] args) {
    int[] arr={1,3,45,67,23,19};
    for(int i=0;i<arr.length;i++){
      boolean isPrime=true;
      if(arr[i]<=1)
        isPrime=false;
      else{
        for(int j=2;j<=arr[i]/2;j++){
          if(arr[i]%j==0)
            isPrime=false;
            break;
        }
      }
      if(isPrime)
       System.out.println(arr[i]);
    }
  }
}
