class Methods9{
  public static void main(String[] args){
    person('a');
  }
  public static void person(char ch){
    if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
      System.out.println("Charachetr");
    }
    else if(ch>='0' && ch<='9'){
      System.out.println("Numbers");
    }
    else{
      System.out.println("Special Charachetr");
    }
  }
}
