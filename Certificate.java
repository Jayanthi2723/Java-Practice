public abstract  class Certificate implements Comparable{
  int cno;
  String name;
  double per;
  public Certificate(int cno,String name,double per){
    super();
    this.cno=cno;
    this.name=name;
    this.per=per;
  }
  @Override
  public int compareTo(Object o){
    Certificate c=(Certificate)o;
    if(this.cno==c.cno)
      return 0;
    else if(this.cno>c.cno)
      return 1;
    else
      return -2;
  }
  @Override
  public String toString(){
    return name;
  }
}
