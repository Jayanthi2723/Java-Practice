interface Interface1{
  void save();
  void saveAs();
  public static void main(String[] args){
    child c=new child();
    c.save();
    c.saveAs();

    Interface1 i=new child();
    i.save();
    i.saveAs();
  }
}
class child implements Interface1{
  @Override
  public void save(){
    System.out.println("save() is Override");
  }
  @Override
  public void saveAs(){
    System.out.println("saveAs() is Override");
  }
}
