interface Interface{
  void m1();
  public static void main(String[] args) {
    c c1=new c();
    c1.m1();

    Interface i=new c();
    i.m1();

  }
}
class c implements Interface{
  @Override
  public void m1(){
    System.out.println("m1() id Override");
  }
}
// class Interface{
//   public static void main(String[] args) {
//     c c1=new c();
//     c1.m1();
//   }
// }
