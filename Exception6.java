class Exception6{//Exception not Occurs
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    try{
      System.out.println(arr[4]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception not Occurs");
    }
  }
}
