class Account{
  String name;
  long accNo;
  double balance;
  public Account(String name,long accNo,double balance){
    this.name=name;
    this.accNo=accNo;
    this.balance=balance;
  }
  public void aDetails(){
    System.out.println(name);
    System.out.println(accNo);
    System.out.println(balance);
  }
  public static void main(String[] args){
    Account a1=new Account("sheela",632534263,7456.635);
    Account a2=new Account("mala",365636,6562.6536);
    a1.aDetails();
    a2.aDetails();
  }
}
