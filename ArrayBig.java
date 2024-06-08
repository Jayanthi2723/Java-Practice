class ArrayBig{
  public static void main(String[] args) {
    int[] arr={23,108,78,12,90,45};
    for(int i=0;i<arr.length;i++){
      if(arr[i]>arr[i+1]){
        int n=arr[i];
        System.out.println(n);
        break;
      }
    }
  }
}
