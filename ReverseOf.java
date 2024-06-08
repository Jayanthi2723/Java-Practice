class ReverseOf{
  public static void main(String[] args) {
    int[] ar={1,3,5,9};
    int r=0;
    int rev=0;
    for(int i=ar.length-1;i>=0;i--){
        rev=ar[i];
        System.out.print(rev);
        r=r+rev;
       System.out.println(r);
  }
}
