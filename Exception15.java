class UnderAgeException extends ArithmeticException{
  @Override
  public String getMessage(){
    return "first grow next grow";
  }
}
class OverAgeException extends ArithmeticException{
  @Override
  public String getMessage(){
    return "service not available";
  }
}
class Application{
  public void verifyAge(int age){
    if(age<22)
      throw new UnderAgeException();
    else if (age>45) {
      throw new OverAgeException();
    }
    else
      System.out.println("welcome to the hell");
  }
}
public class Exception15{
  public static void main(String[] args) {
    Application a=new Application();
    try{
      a.verifyAge(60);
    }
    catch (UnderAgeException e) {
      System.out.println(e.getMessage());
    }
    catch (OverAgeException e) {
      System.out.println(e.getMessage());
    }
  }
}
