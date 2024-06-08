class Song{
  String song;
  String singer;
  double duration;
  public Song(String song){
    this.song=song;
  }
  public Song(String song,String singer){
    this(song);
    this.singer=singer;
  }
  public Song(String song,String singer,double duration){
    this(song,singer);
    this.duration=duration;
  }
  public void sDetails(){
    System.out.println(song);
    System.out.println(singer);
    System.out.println(duration);
  }
  public static void main(String[] args){
    Song s1=new Song("ohh baby","nethra");
    Song s2=new Song("alagiya laila","jayanthi",4.45);
    s1.sDetails();
    s2.sDetails();
  }
}
