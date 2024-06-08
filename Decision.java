class Decision{
  public static void main(String[] args){
    int i1=45;
    int i2=54;
    System.out.println("========== if statement ============");
    if(i1>i2){
      System.out.println(i1);
    }
    if(i2>i1)
      System.out.println(i2);
    System.out.println("============ if else statement ==============");
    if(i1<i2)
      System.out.println(i1);
    else
      System.out.println(i2);
    System.out.println("============ if-else if statement ===========");
    if(i1>i2)
      System.out.println(i1);
    else if(i2<i1)
      System.out.println(i2);
    else if(i1==i2)
      System.out.println("equals");
    else
      System.out.println("null");
    System.out.println("============= switch case ================");  
    int x=5;
    switch(x){
      case 1:
      {
        System.out.println("case 1");
      }
      break;
      case 2:
      {
        System.out.println("case 2");
      }
      break;
      case 3:
      {
        System.out.println("case 3");
      }
      break;
      case 4:
        System.out.println("case 4");
      break;
      case 5:
        System.out.println("case 5");
      break;
      default:
        System.out.println("no cases are available");
    }
  }
}
