class Array9{
  String name;
  int id;
  public Array9(String name,int id){
    this.name=name;
    this.id=id;
  }
  @Override
  public String toString(){
    return name;
  }
  public static void main(String[] args) {
    Array9[] a=new Array9[4];
    a[0]=new Array9("jaya",12);
    a[1]=new Array9("laya",45);
    a[2]=new Array9("maya",67);
    a[3]=new Array9("raya",76);
    System.out.println(a[1].name);
    System.out.println(a[3].id);
    System.out.println(a[2].name);
    System.out.println(a[0]);
  }
}
