class Account1{
  long accNo;
  String name;
  double balance;
  public Account1(long accNo,String name,double balance){
    this.accNo=accNo;
    this.name=name;
    this.balance=balance;
  }
  public Account1(long accNo,String name){
    this.accNo=accNo;
    this.name=name;
  }
  public Account1(long accNo){
    this.accNo=accNo;
  }
  public void aDetails(){
    System.out.println(accNo);
    System.out.println(name);
    System.out.println(balance);
  }
  public static void main(String[] args){
    Account1 a1=new Account1(635837,"sheela",4657.7673);
    Account1 a2=new Account1(63437,"mala");
    Account1 a3=new Account1(76547);
    a1.aDetails();
    a2.aDetails();
    a3.aDetails();
  }
}
