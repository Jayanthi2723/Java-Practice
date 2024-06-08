class InvalidOtpException extends NullPointerException{
  @Override
  public String getMessage(){
    return "mismatch otp";
  }
}
class Application{
  public void verifyOtp(int otp){
    if(otp==1234)
      System.out.println("successfully verified");
    else
      throw new InvalidOtpException();
  }
}
public class Exception14{
  public static void main(String[] args) {
    Application p=new Application();
    try{
      p.verifyOtp(134);
    }
    catch (InvalidOtpException e) {
      System.out.println(e.getMessage());
    }
  }
}
