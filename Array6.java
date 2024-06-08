class Array6{
  public static void main(String[] args) {
    int arr[]={3,7,5,9,11,4};
    for(int i=0;i<arr.length;i++){
      int n=arr[i];
      int c=0;
      for(int j=1;j<=n;j++){
        if(n%j==0)
          c++;
      }
      if(c==2)
        System.out.println(n);
    }
  }
}
