class BeforeSchoolTime extends ArithmeticException{
  @Override
  public String getMessage(){
    return "school gate opens at 7:00'clock";
  }
}
class AfterSchoolTime extends ArithmeticException{
  @Override
  public String getMessage(){
    return "school gate is closed at 9:00'clock";
  }
}
class Application{
  public void schoolTime(double t){
    if(t<7.00)
      throw new BeforeSchoolTime();
    else if(t>9.00)
      throw new AfterSchoolTime();
    else
      System.out.println("youre allowed to the school");
  }
}
class Exception16{
  public static void main(String[] args) {
    Application a=new Application();
    try{
      a.schoolTime(09.00);
    }
    catch(BeforeSchoolTime e){
      System.out.println(e.getMessage());
    }
    catch (AfterSchoolTime e) {
      System.out.println(e.getMessage());
    }
  }
}
