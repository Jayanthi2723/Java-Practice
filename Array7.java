class Array7{
  public static void main(String[] args) {
    int arr[]={34,56,23,78,98};
    for(int i=0;i<arr.length;i++){
      int n=arr[i];
      for(int j=1;j<arr.length-1;j++){
        if(n<arr[j]){
          n=arr[j];
          System.out.println(n);
        }  
      }
    }
  }
}
