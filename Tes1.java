class Test1{
  public static void main(String[] args) {
    Camera c1=new Camera("sony",12);
    Camera c2=c1;
    System.out.println(c1==c2);
    System.out.println(c1.hashcode());
    System.out.println(c2.hashcode());
  }
}
