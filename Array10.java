class Array10{
  String name;
  int id;
  double price;
  public Array10(String name,int id,double price){
    this.name=name;
    this.id=id;
    this.price=price;
  }
  public static void main(String[] args) {
    Array10 a[]=new Array10[4];
    a[0]=new Array10("jaya",1,89);
    a[1]=new Array10("raya",2,78);
    a[2]=new Array10("laya",3,56);
    a[3]=new Array10("maya",4,67);
    for(int i=0;i<a.length;i++){
      System.out.println(a[i].name);
    }
  }
}
