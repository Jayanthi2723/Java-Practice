class ParaConStructor3{
  String name;
  long accNo;
  double bal;
  public ParaConStructor3(String name,long accNo,double bal){
    this.name=name;
    this.accNo=accNo;
    this.bal=bal;
  }
  public void allDetails(){
    System.out.println(name);
    System.out.println(accNo);
    System.out.println(bal);
  }
  public static void main(String[] args){
    ParaConStructor3 p1=new ParaConStructor3("jaya",6567685735465L,56.67);
    ParaConStructor3 p2=new ParaConStructor3("raya",635436456768L,87.457);
    p1.allDetails();
    p2.allDetails();
  }
}
