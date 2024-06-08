class Looping{
  public static void main(String[] args){
    int i=1;
    while(i<=5){
      System.out.println("hi jaya");
      i++;
    }
    int j=1;
    while(j<=10){
      System.out.println("nothing");
      j++;
    }
    int n=1;
    while(n<=10){
      System.out.print(n+" ");
      n++;
    }
    System.out.println();
    int k=1;
    while(k<=10){
      if(k%2==0){
        System.out.print(k+" ");
      }
      k++;
    }
    System.out.println();
    int m=1;
    while(m<=10){
      if(m%2!=0){
        System.out.print(m+" ");
      }
      m++;
    }
    int s=1;
    do{
      System.out.println("hii");
      s++;
    }
    while(s<=10);
    int t=1;
    do{
      if(t%2==0){
        System.out.print(t+" "+"even"+",");
      }
      t++;
    }
    while(t<=10);
    System.out.println();
    int z=1;
    do{
      if(z%3==0 && z%5==0){
        System.out.println(z);
      }
      z++;
    }
    while(z<=50);
    System.out.println();
    for(int g=1;g<=50;g++){
      if(g%3==0 && g%5==0){
        System.out.print(g+" ");
      }
    }
    System.out.println();
    for(int w=1;w<=10;w++){
      if(w%2==0){
        System.out.print(w+" ");
      }
    }
    System.out.println();
    for(int x=1;x<=10;x++){
      if(x%2!=0){
        System.out.print(x+" ");
      }
    }
    System.out.println();
    int sum=0;
    for(int r=0;r<=10;r++){
      sum+=r;
    }
    System.out.println(sum);

    System.out.println();
    for(char ch='A';ch<='Z';ch++){
      System.out.print(ch+" ");
    }
    System.out.println();
    for(char ch='a';ch<='z';ch++){
      System.out.print(ch+" ");
    }
  }
}
