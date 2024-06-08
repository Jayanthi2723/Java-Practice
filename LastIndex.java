class LastIndex{
  public static void main(String[] args){
    String s="tapacad";
    char k='a';
    //int count=0;
    for(int i=s.length()-1;i>=0;i--){
      if(s.charAt(i)==k){
        System.out.println(i);
        break;
      }
    }
  }
}
