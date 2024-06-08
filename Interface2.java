interface Interface2{
  void withdraw();
  void deposit();
  public static void main(String[] args){
    child c= new child();
    c.withdraw();
    c.deposit();

    Interface2 i=new child();
    i.withdraw();
    i.deposit();
  }
}
class child implements Interface2{
  @Override
  public void withdraw(){
    System.out.println("withdraw money");
  }
  @Override
  public void deposit(){
    System.out.println("money deposited");
  }
}
