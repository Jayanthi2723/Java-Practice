class Product1 {  // implements Comparable
  int id;
  String name;
  double price;
  public Product1(int id,String name,double price){
    this.id=id;
    this.name=name;
    this.price=price;
  }
  public String toString(){
    return name;
  }
  //@Override
  public int compareTo(Object O){
    Product1 c=(Product1)O;
    if(this.price==c.price)
      return 0;
    else if(this.price>c.price)
      return 1;
    else
      return -2;
  }
}
