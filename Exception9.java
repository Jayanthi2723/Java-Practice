class Exception9{
  public static void main(String[] args) {
    String s="jayanthi";
    try{
      System.out.println(s.charAt(9));
    }
    catch (NullPointerException e) {
      System.out.println("type of object address and variable address are not same");
    }
    catch (ArithmeticException e) {
      System.out.println("type of object address and variable address are not same");
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("type of object address and variable address are not same");
    }
    catch(StringIndexOutOfBoundsException e){
      System.out.println("exception occurs and handled");
    }
    catch (Throwable e) {
      System.out.println("something went wrong");
    }
  }
}
