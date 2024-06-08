class Str2{
  public static void main(String[] args){
    String s1="JAVA";
    String s2="PYTHON";
    String s3="JAVA"+"PYTHON";
    String s4="JAVA"+"PYTHON";
    if(s3==s4){
      System.out.println("References are equal");
    }
    else{
      System.out.println("References are not equal");
    }
    System.out.println();
    String s5=s1+s2;
    String s6=s1+s2;
    if(s5==s6){
      System.out.println("References are equal");
    }
    else{
      System.out.println("References are not equal");
    }
    System.out.println();
    String s7="java";
    if(s1==s7){
      System.out.println("References are equal");
    }
    else{
      System.out.println("References are not equal");
    }
    System.out.println();
    if(s1.equalsIgnoreCase(s7)==true){
      System.out.println("String values are equal");
    }
    else{
      System.out.println("String values are not equal");
    }
    System.out.println();
  }
}
