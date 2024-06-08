class Exception10{//exception object propagation
  public static void div(int a,int b){
    int r=a/b;
    System.out.println(r);
  }
  public static void main(String[] args) {
    try{
      div(20,0);
    }
    catch (NullPointerException e) {
      System.out.println("exception occurs handled");
    }
  }
}
