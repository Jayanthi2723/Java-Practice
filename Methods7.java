class Methods7{
  public static void main(String[] args){
    vowel('a');
    vowel('e');
  }
  public static void vowel(char ch)
  {
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    {
      System.out.println("vowel");
    }
    else{
      System.out.println("consonant");
    }
  }
}
