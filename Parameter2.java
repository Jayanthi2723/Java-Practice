class Parameter2{
  public static void main(String[] args){
    System.out.println(great(13,24,56));
    int res=great(34,65,78);
    System.out.println(res);
  }
  public static int great(int num1,int num2,int num3){
    if(num1>num2 && num1>num3)
      return num1;
    else if(num2>num3)
      return num2;
    else
      return num3;
  }
}
