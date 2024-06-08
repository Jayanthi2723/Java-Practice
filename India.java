class India{
  static String pm="Teja";
  public static void karnataka(){
    System.out.println(pm);
  }
  public static void tamilnadu(){
    System.out.println(pm);
  }
  public static void andhra(){
    System.out.println(pm);
  }
  public static void main(String[] args){
    pm="Bharath";
    karnataka();
    tamilnadu();
    andhra();
  }
}
