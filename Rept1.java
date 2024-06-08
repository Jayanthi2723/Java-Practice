class Rept1 {
    public static void main(String[] args) {
        byte a = 10;
        short b = a;    // byte to short
        int c = b;      // short to int
        long d = c;     // int to long
        float e = d;    // long to float
        double f = e;   // float to double

        // Printing the data types of variables
        System.out.println("Data type of variable a: " + Byte.class.getSimpleName());
        System.out.println("Data type of variable b: " + Short.class.getSimpleName());
        System.out.println("Data type of variable c: " + Integer.class.getSimpleName());
        System.out.println("Data type of variable d: " + Long.class.getSimpleName());
        System.out.println("Data type of variable e: " + Float.class.getSimpleName());
        System.out.println("Data type of variable f: " + Double.class.getSimpleName());
    }
}
