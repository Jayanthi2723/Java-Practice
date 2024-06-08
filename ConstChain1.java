class ConstChain1{
  String name;
  long cno;
  long alco;
  public ConstChain1(String name){
    this.name=name;
  }
  public ConstChain1(String name,long cno){
    this(name);
    this.cno=cno;
  }
  public ConstChain1(String name,long cno,long alco){
    this(name,cno);
    this.alco=alco;
  }
  public void allDetails(){
    System.out.println(name);
    System.out.println(cno);
    System.out.println(alco);
  }
  public static void main(String[] args){
    ConstChain1 c1=new ConstChain1("jaya",7465,634587);
    ConstChain1 c2=new ConstChain1("raya",76847689);
    ConstChain1 c3=new ConstChain1("jayanthi");
    c1.allDetails();
    c2.allDetails();
    c3.allDetails();
  }
}
