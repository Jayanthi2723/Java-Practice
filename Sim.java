class Sim{
  private long sNo;
  private String sp;
  private double balance;
  public Sim(long sNo,String sp,double balance){
    this.sNo=sNo;
    this.sp=sp;
    this.balance=balance;
  }
  public long getSno(){
    return sNo;
  }
  public String getSp(){
    return sp;
  }
  public void setSp(String sp){
    this.sp=sp;
  }
  public double getBalance(){
    return balance;
  }
  public void setBalance(double balance){
    this.balance=balance;
  }
  public static void main(String[] args){
    Sim s1=new Sim(352642654,"Airtel",499);
    System.out.println(s1.getSno());
    System.out.println(s1.getSp());
    System.out.println(s1.getBalance());
    s1.setSp("jio");
    s1.setBalance(799);
    System.out.println(s1.getSno());
    System.out.println(s1.getSp());
    System.out.println(s1.getBalance());
  }
}
