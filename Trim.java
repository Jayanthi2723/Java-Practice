class Trim{
  public static void main(String[] args){
    String s="   java   ";
    String t=" ";
    int si=0,ei=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)!=' '){
        si=i;
        break;
      }
    }
    for(int i=s.length()-1;i>=0;i--){
      if(s.chartAt(i)!=' '){
        ei=i;
        break;
      }
    }
    for(int i=si;i<=ei;i++){
      t=t+s.charAt(i);
    }
    System.out.println(t);
  }
}
