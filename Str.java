class Str{
  public static void main(String[] args){
    String s1= new String("JAVA");
    String s2=new String("JAVA");
    if(s1==s2){
      System.out.println("References are equal");
    }
    else{
      System.out.println("References are not equal");
    }
    if(s1.equals(s2)==true){
      System.out.println("String values are equal");
    }
    else{
      System.out.println("String values are not equal");
    }
  }
}
