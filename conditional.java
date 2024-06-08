class conditional{
  public static void main(String[] args){
    int n=34;
    String res= n%3==0 && n%5==0 ? "Yes":"No";
    System.out.println(n+" "+"is divisible by 3 and 5"+" "+res);
  }
}
