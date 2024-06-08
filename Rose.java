class Rose{
  private String boyFriend;
  public Rose(String boyFriend){
    this.boyFriend=boyFriend;
  }
  public String getBoyFriend(){
    return boyFriend;
  }
  public void setBoyFriend(String boyFriend){
    this.boyFriend=boyFriend;
  }
  public static void main(String[] args){
    Rose r1=new Rose("Jack");
    System.out.println(r1.getBoyFriend());
    r1.setBoyFriend("bb");
    System.out.println(r1.getBoyFriend());
  }
}
