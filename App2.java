class App2{
  String name;
  long cNo;
  long alcNo;
  String gender;
  public App2(String name,long cNo){
    this(name);
    this.cNo=cNo;
  }
  public App2(String name){
    this.name=name;
  }
  public App2(String name,long cNo,long alcNo){
    this(name,cNo);
    this.alcNo=alcNo;
  }
  public App2(String name,long cNo,long alcNo,String gender){
    this(name,cNo,alcNo);
    this.gender=gender;
  }
  public void aDetails(){
    System.out.println(name);
    System.out.println(cNo);
    System.out.println(alcNo);
    System.out.println(gender);
  }
  public static void main(String[] args){
    App2 a1=new App2("dd",7465,8748);
    App2 a2=new App2("madhu",77465,4746564,"male");
    App2 a3=new App2("mala");
    a1.aDetails();
    a2.aDetails();
    a3.aDetails();
  }
}
