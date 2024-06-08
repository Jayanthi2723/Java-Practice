class Str1{
  public static void main(String[] args){
    String s1="java";
    //String s2="JAVA";
    String s2=new String("JAVA");
    if(s1==s2){
      System.out.println("References are equal");
    }
    else{
      System.out.println("References are not equal");
    }
    if(s1.equalsIgnoreCase(s2)==true){
      System.out.println("String values are equal by ingoring case");
    }
    else{
      System.out.println("String values  are not equal by ignoring case");
    }
    String s3="JAVA";
    String s4;
    s4=s3;
    if(s3==s4){
      System.out.println("References are equal");
    }
    else{
      System.out.println("References are not equal");
    }
  }
}
