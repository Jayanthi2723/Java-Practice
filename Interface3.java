interface Interface3{
  void text();
  public static void main(String[] args){
    msexcel m=new msexcel();
    m.text();
    m.shapes();
    m.sketch();

    msword m1=new msexcel();
    m1.text();
    m1.shapes();
    //m1.sketch();

    Interface3 i=new msexcel();
    i.text();
    //i.shapes();
    //i.sketch();
  }
}
interface msword extends Interface3 {
  void shapes();
}
class msexcel implements msword,Interface3{
  @Override
  public void text(){
    System.out.println("&");
  }
  public void shapes(){
    System.out.println("/");
  }
  public void sketch(){
    System.out.println("*");
  }
}
