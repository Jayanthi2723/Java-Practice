class Encapsulation2{
  private long cardNo;
  private int pwd;
  private String expDate;
  private int cvv;
  public Encapsulation2(long cardNo,int pwd,String expDate,int cvv){
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
    Encapsulation2 e1=new Encapsulation2(13333555,34566,"34-45-22",567);
    System.out.println(e1.getCardNo());
    System.out.println(e1.getPwd());
    System.out.println(e1.getExpDate());
    System.out.println(e1.getCvv());
    e1.setPwd(235);
    System.out.println(e1.getPwd());
  }
}
