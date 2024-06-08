class Array2{
  public static void main(String[] args) {
    char ch[]={'a','b','c','d'};
    for(int i=0;i<ch.length;i++){
      System.out.print(ch[i]+" ");
    }
    System.out.println();
    for(int j=ch.length-1;j>=0;j--){
      System.out.print(ch[j]+" ");
    }
  }
}
