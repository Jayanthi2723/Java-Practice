class Methods5{
  public static void main(String[] args){
    lastDigit(1234);
    lastDigit(4567);
    lastDigit(7645);
  }
  public static void lastDigit(int num){
    int res=num%10;
    System.out.println(res);
  }
}
