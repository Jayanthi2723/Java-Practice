public class Array {
    public static void main(String[] args){
        int[] ar={1,3,5,9};
        int r=0;
        int rev=0;
        int z=0;
        int m=0;
        for(int i=ar.length-1;i>=0;i--){
            rev=ar[i];
            r=r+rev;
        }
        System.out.println(r);
        for(int i=0;i<ar.length;i++){
            if(ar[i]>z)
             z=ar[i];
        }
        System.out.println(z);
        for(int i=0;i<=ar.length-1;i++){
            if(z>ar[i]&& ar[i]!=z)
             m=ar[i];
            System.out.println(m);
            break; 
        }
    }
}
