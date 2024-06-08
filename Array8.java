class Array8{
  String brand;
  int ram;
  public Array8(String brand,int ram){
    this.brand=brand;
    this.ram=ram;
  }
  public static void main(String[] args) {
    Array8 a[]=new Array8[3];
    a[0]=new Array8("hp",40);
    a[1]=new Array8("re",98);
    a[2]=new Array8("hero",76);
    System.out.println(a[0]);
    System.out.println(a[1].ram);
    System.out.println(a[2].brand);
    System.out.println(a[0].ram);
  }
}
