class Application{
  String name;
  long cNo;
  long alcNo;
  public Application(String name){
    this.name=name;
  }
  public Application(String name,long cNo){
    this.name=name;
    this.cNo=cNo;
  }
  public Application(String name,long cNo,long alcNo){
    this.name=name;
    this.cNo=cNo;
    this.alcNo=alcNo;
  }
  public void aDetails(){
    System.out.println(name);
    System.out.println(cNo);
    System.out.println(alcNo);
  }
  public static void main(String[] arsg){
    Application a1=new Application("sheela",6437767);
    Application a2=new Application("mala",63473657,7465874);
    Application a3=new Application("madhu");
    a1.aDetails();
    a2.aDetails();
    a3.aDetails();
  }
}
