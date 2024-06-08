class Fruit1{
  String name;
  String color;
  public void allDetails(){
    System.out.println(name);
    System.out.println(color);
  }
  public void initialize(String name,String color){
    this.name=name;
    this.color=color;
  }
  public static void main(String[] args){
    Fruit1 f1= new Fruit1();
    f1.initialize("Apple","Red");
    Fruit1 f2= new Fruit1();
    f2.initialize("Mango","Yellow");
    Fruit1 f3=new Fruit1();
    f3.initialize("Grapes","Green");
    f1.allDetails();
    f2.allDetails();
    f3.allDetails();
  }
}
