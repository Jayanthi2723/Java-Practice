class Global{
  String name;
  String breed;
  int cost;
  public static void main(String[] args){
    Global dog=new Global();
    dog.name="scooby";
    dog.breed="pug";
    dog.cost=12000;
    System.out.println(dog.name);
    System.out.println(dog.breed);
    System.out.println(dog.cost);
  }
}
