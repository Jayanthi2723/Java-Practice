class ParaConStructor1{
  String name;
  int ram;
  String color;
  public ParaConStructor1(String name,int ram,String color){
    this.name=name;
    this.ram=ram;
    this.color=color;
  }
  public void allDetails(){
    System.out.println(name);
    System.out.println(ram);
    System.out.println(color);
  }
  public static void main(String[] args){
    ParaConStructor1 p1=new ParaConStructor1("1+",12,"black");
    ParaConStructor1 p2=new ParaConStructor1("redmi",23,"blue");
    p1.allDetails();
    p2.allDetails();
  }
}
