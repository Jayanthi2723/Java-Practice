class Exception12{
  public static void main(String[] args) {
    m1();
  }
  public static void m1(){
    System.out.println("m1() is started");
    try{
      Thread.sleep(5000);
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("m1() is stopped");
  }
}
