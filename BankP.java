class BankP{
  String bname;
  String branch;
  String ifsc;
  public BankP(String bname,String branch,String ifsc){
    this.bname=bname;
    this.branch=branch;
    this.ifsc=ifsc;
  }
  public void bDetails(){
    System.out.println(bname);
    System.out.println(branch);
    System.out.println(ifsc);
  }
  public static void main(String[] args){
    BankP b1=new BankP("sbi","pannur","fge674334");
    BankP b2=new BankP("hdfc","btm","ge6362ds");
    b1.bDetails();
    b2.bDetails();
  }
}
