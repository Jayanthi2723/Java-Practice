class DebitCard{
  private long cardNo;
  private int pwd;
  private String expDate;
  private int cvv;
  public DebitCard(long cardNo,int pwd,String expDate,int cvv){
    this.cardNo=cardNo;
    this.pwd=pwd;
    this.expDate=expDate;
    this.cvv=cvv;
  }
  public long getCardNo(){
    return cardNo;
  }
  public int getPwd(){
    return pwd;
  }
  public void setPwd(int pwd){
    this.pwd=pwd;
  }
  public String getExpDate(){
    return expDate;
  }
  public int getCvv(){
    return cvv;
  }
  public static void main(String[] args){
    DebitCard d1=new DebitCard(234563546,5675,"27/24",566);
    System.out.println(d1.getCardNo());
    System.out.println(d1.getPwd());
    System.out.println(d1.getExpDate());
    System.out.println(d1.getCvv());
    d1.setPwd(6534);
    System.out.println(d1.getCardNo());
    System.out.println(d1.getPwd());
    System.out.println(d1.getExpDate());
    System.out.println(d1.getCvv());
  }
}
