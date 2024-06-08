class WtsApp{
  private long cNo;
  private String name;
  private int spin;
  private String status;
  public WtsApp(long cNo,String name,int spin,String status){
    this.cNo=cNo;
    this.name=name;
    this.spin=spin;
    this.status=status;
  }
  public long getCno(){
    return cNo;
  }
  public void setCno(long cNo){
    this.cNo=cNo;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
  public void setSpin(int spin){
    this.spin=spin;
  }
  public String getStatus(){
    return status;
  }
  public void setStatus(String status){
    this.status=status;
  }
  public static void main(String[] args){
    WtsApp w1=new WtsApp(254574637,"nethra",6452,"sleeping");
    System.out.println(w1.getCno());
    System.out.println(w1.getName());
    System.out.println(w1.getStatus());
    w1.setCno(235465);
    w1.setName("jaya");
    w1.setStatus("depression");
    System.out.println(w1.getCno());
    System.out.println(w1.getName());
    System.out.println(w1.getStatus());
  }
}
