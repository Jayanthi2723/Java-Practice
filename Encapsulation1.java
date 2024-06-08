class Encapsulation1{
  private long sno;
  private String sp;
  private double bal;
  public Encapsulation1(long sno,String sp,double bal){
    this.sno=sno;
    this.sp=sp;
    this.bal=bal;
  }
  public long getSno(){
    return sno;
  }
  public String getSp(){
    return sp;
  }
  public void setSp(String sp){
    this.sp=sp;
  }
  public double getBal(){
    return bal;
  }
  public void setBal(double bal){
    this.bal=bal;
  }
  public static void main(String[] args){
    Encapsulation1 e1=new Encapsulation1(132444465,"jio",87.45);
    System.out.println(e1.getSno());
    System.out.println(e1.getSp());
    System.out.println(e1.getBal());
    e1.setSp("airtel");
    e1.setBal(67.908);
    System.out.println(e1.getSno());
    System.out.println(e1.getSp());
    System.out.println(e1.getBal());
  }
}
