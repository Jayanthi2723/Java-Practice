class IndexOf{
  public static void main(String[] args){
    String s="java";
    char c='v';
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)==c){
        System.out.println(i);
      }
    }
  }
}
