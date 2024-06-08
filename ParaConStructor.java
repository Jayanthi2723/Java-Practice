class ParaConStructor{
  String name;
  String color;
  public ParaConStructor(String name,String color){
    this.name=name;
    this.color=color;
  }
  public void allDetails(){
    System.out.println(name);
    System.out.println(color);
  }
  public static void main(String[] args){
    ParaConStructor p1=new ParaConStructor("orange","red");
    ParaConStructor p2=new ParaConStructor("grapes","green");
    p1.allDetails();
    p2.allDetails();
  }
}
