class ParaConStructor4{
  String bank;
  String branch;
  String ifsc;
  public ParaConStructor4(String bank,String branch,String ifsc){
    this.bank=bank;
    this.branch=branch;
    this.ifsc=ifsc;
  }
  public void allDetails(){
    System.out.println(bank);
    System.out.println(branch);
    System.out.println(ifsc);
  }
  public static void main(String[] args){
    ParaConStructor4 p1=new ParaConStructor4("sbi","pannur","6546br4y");
    ParaConStructor4 p2=new ParaConStructor4("axis","pannur","4656bfgdgf65");
    p1.allDetails();
    p2.allDetails();
  }
}
