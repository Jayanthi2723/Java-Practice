public class Character{
  public static void main(String[] args){
     character('j');
     //character('8');
     //character('$');
  }
  public static void character(char ch){
    if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
      System.out.println("Alphabet");
    }
    else if(ch>='0' && ch<='9'){
      System.out.println("Number");
    }
    else{
      System.out.println("Special character");
    }
  }
}
