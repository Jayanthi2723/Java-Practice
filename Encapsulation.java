class Encapsulation{
  private String boyFriend;
  public Encapsulation(String boyFriend){
    this.boyFriend=boyFriend;
  }
  public String getBoyFriend(){
    return boyFriend;
  }
  public void setBoyFriend(String boyFriend){
    this.boyFriend=boyFriend;
  }
  public static void main(String[] args){
    Encapsulation e1=new Encapsulation("bharath");
    System.out.println(e1.getBoyFriend());
    e1.setBoyFriend("jack");
    System.out.println(e1.getBoyFriend());
  }
}
