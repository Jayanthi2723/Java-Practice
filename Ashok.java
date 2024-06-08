public class Ashok{
  public static void main(String[] args){
    String str="Jayanthi";
    String s="";
    String s1="";
    for(int i=0; i<str.length()-1;i+=2){
      //System.out.println(str.substring(i,i+2)+" ");
      s=str.substring(i,i+2)+" ";
      //s1=s+" ";
      System.out.println(s);
      s1=s1+s;
    }
    //s1.trim();
    //String s2=s1.replaceAll("\\s","");
    //System.out.println(s2);
    System.out.println(s1.replaceAll("\\s",""));
    //if(str.length()%2!=0){
      //System.out.println(str.substring(str.length()-1));
    //}
    //System.out.println(s1.concat(s));
   }
}
