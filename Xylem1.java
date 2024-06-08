public class Xylem1{
  public static void main(String[] args){
    int number=1234;
    int  temp=number, OuterSum=0, InnerSum=0;
    while(temp != 0)
    {
        if(temp == number || temp < 10)
            //Adds the first and last digits
            OuterSum = OuterSum + temp % 10;
        else
            //finds the mean digits and adds
            InnerSum = InnerSum + temp % 10;
        temp = temp / 10;
    }
    if(OuterSum==InnerSum) // condition for Xylem
    {
        System.out.println(number+" is a Xylem number");
    }
    else
    {
        System.out.println(number+" is a Phloem number");
    }
  }
  }
}
