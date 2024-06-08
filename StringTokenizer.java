import java.util.StringTokenizer;
class Demo{
  public static void main(String[] args){
    String s="JAVA PYTHON SQL AI";
    StringTokenizer st=new StringTokenizer(s,"");
    while(st.hasMoreTokens()==true)
    {
      System.out.println(st.nextToken());
    }
  }
}
