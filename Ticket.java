class Ticket{
  int tNo;
  int count;
  double price;
  public Ticket(int tNo){
    this.tNo=tNo;
  }
  public Ticket(int tNo,int count){
    this(tNo);
    this.count=count;
  }
  public Ticket(int tNo,int count,double price){
    this(tNo,count);
    this.price=price;
  }
  public void tDetails(){
    System.out.println(tNo);
    System.out.println(count);
    System.out.println(price);
  }
  public static void main(String[] args){
    Ticket t1=new Ticket(3564,35648,726247.54552);
    Ticket t2=new Ticket(34765746);
    t1.tDetails();
    t2.tDetails();
  }
}
