class Exception13{
  public static void main(String[] args) {
    try{
      m1();
    }
    catch (ArithmeticException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  public static void m1() throws InterruptedException,ArithmeticException{
    Thread.sleep(5000);
    System.out.println("jaya");
    Thread.sleep(5000);
    int res=5/0;
  }
}
