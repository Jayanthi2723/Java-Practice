class Polymorphism4{//variable shadowing
  int b=45;
  public static void main(String[] args){
    map m=new map();
    System.out.println(m.b);

    Polymorphism4 p=new map();
    System.out.println(p.b);
  }
}
class map extends Polymorphism4{
  int b=50;
}
