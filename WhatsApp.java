class WhatsApp{
  String name;
  long cNo;
  public WhatsApp(String name,long cNo){
    this.name=name;
    this.cNo=cNo;
  }
  public void account(){
    System.out.println(name);
    System.out.println(cNo);
  }
  public static void main(String[] args){
    WhatsApp w1=new WhatsApp("sheela",746563);
    WhatsApp w2=new WhatsApp("mala",745684756);
    w1.account();
    w2.account();
  }
}
