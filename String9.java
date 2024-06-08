class String9{
  public static void main(String[] args) {
    StringBuffer s=new StringBuffer();
    StringBuffer s1=new StringBuffer("monday");
    System.out.println(s1);
    s=s.append("jaya");
    System.out.println(s);
    StringBuffer s2=new StringBuffer("monday");
    System.out.println(s2);
    System.out.println(s1==s2);
    System.out.println(s1.equals(s2));// not ovveriden
    System.out.println(s1.deleteCharAt(2));
    System.out.println(s1.delete(0,2));
  }
}
