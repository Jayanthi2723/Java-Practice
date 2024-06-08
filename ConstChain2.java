class ConstChain2{
  String song;
  String singer;
  double duration;
  public ConstChain2(String song){
    this.song=song;
  }
  public ConstChain2(String song,String singer){
    this(song);
    this.singer=singer;
  }
  public ConstChain2(String song,String singer,double duration){
    this(song,singer);
    this.duration=duration;
  }
  public ConstChain2(String song,double duration){
    this(song);
    this.duration=duration;
  }
  public void allDetails(){
    System.out.println(song);
    System.out.println(singer);
    System.out.println(duration);
  }
  public static void main(String[] args){
    ConstChain2 c1=new ConstChain2("kadhal needhana","jayanthi",46.23);
    ConstChain2 c2=new ConstChain2("ra chiluka ra","nethra",43.98);
    c1.allDetails();
    c2.allDetails();
  }
}
