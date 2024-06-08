class Calci{
  public static void main(String[] args){
    int n1=3,n2=4,n3=3;
    switch(n3){
      case 1:
      {
        System.out.println(n1+n2);
        break;
      }
      case 2:
      {
        System.out.println(n1-n2);
        break;
      }
      case 3:
      {
        System.out.println(n1*n2);
        break;
      }
      case 4:
      {
        System.out.println(n1/n2);
        break;
      }
      case 5:
      {
        System.out.println(n1%n2);
        break;
      }
      default:
      {
        System.out.println("out of switch ");
      }
    }
  }
}
