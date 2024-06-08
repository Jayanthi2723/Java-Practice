class Methods{
  public static void main(String[] args){
    System.out.println("Main start");
    noLeave();
    noLeave();
    leave();
    System.out.println("Main end");
    leave();
  }
  public static void noLeave(){
    System.out.println("Java Classes");
  }
  public static void leave(){
    System.out.println("Sunday");
  }
}
