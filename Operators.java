class Operators{
  public static void main(String[] args){
    short s1=13;
    short s2=14;
    int res=s1+s2;

    byte b1=12;
    byte b2=13;
    int res1=b2-b1;

    int i1=14;
    int i2=13;
    int res2=i1*i2;

    long l1=3;
    long l2=34;
    long res3=l2/l1;

    double d1=34.34d;
    double d2=23.23d;
    double res4=d1+d2;

    float f1=23.34f;
    float f2=3.23f;
    float res5=f1-f2;
    
    System.out.println("=======if bothe operands are same");
    System.out.println(res);
    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);
    System.out.println(res4);
    System.out.println(res5);
    System.out.println("=======both operands are different.larger data type will be the res=======");
    int res6=b1*s1;
    long res7=l1+s2;
    double res8=d2-b1;
    float res9=f2%l1;
    System.out.println(res6);
    System.out.println(res7);
    System.out.println(res8);
    System.out.println(res9);
    System.out.println("======concatenation Operator=====");
    System.out.println("hello world"+32434+" "+b1);
    System.out.println("========Assignment Operator=========");
    b1+=13;//b1=b1+13
    b2*=2;
    l2/=4;
    d2%=2;
    f2-=0.1;
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(l2);
    System.out.println(d2);
    System.out.println(f2);
    System.out.println("======relational operator======");
    if(b1==b2)
      System.out.println(true);
    else
      System.out.println(false);
    System.out.println("==========increment/decrement operator======");
    System.out.println(++b1);//pre increment
    System.out.println(b1++);//post increment
    System.out.println(res);
    System.out.println(--b1);//pre decrement
    System.out.println(b1--);//post decrement
    System.out.println(res);
    System.out.println("=========logical operator=========");
    if(b1==b2 && s1==s2)
      System.out.println(true);
    else
      System.out.println(false);
    System.out.println("=========conditional operator========");
    int res10=s1>s2?s1:s2;
    //System.out.println(s1);
    //System.out.println(s2);
    System.out.println(res10);
  }
}
