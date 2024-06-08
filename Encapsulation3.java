class Encapsulation3{
  private long cno;
  private String name;
  private int spin;
  private String status;
  public Encapsulation3(long cno,String name,int spin,String status){
    this.cno=cno;
    this.name=name;
    this.spin=spin;
    this.status=status;
  }
  public long getCno(){
    return cno;
  }
  public void setCno(long cno){
    this.cno=cno;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
  public int getSpin(){
    return spin;
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
    Encapsulation3 e1=new Encapsulation3(654537,"jaya",2345,"dead");
    System.out.println(e1.getCno());
    System.out.println(e1.getName());
    System.out.println(e1.getSpin());
    System.out.println(e1.getStatus());
    e1.setCno(133576);
    e1.setName("bharath");
    e1.setStatus("alive");
    e1.setSpin(234545);
    System.out.println(e1.getCno());
    System.out.println(e1.getName());
    System.out.println(e1.getSpin());
    System.out.println(e1.getStatus());
  }
}
