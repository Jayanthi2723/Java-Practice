class Driver {
    public static void main(String[] args) {
        int a = bar(3);
        int b = foo(a);
    }

    static int foo(int a) {
        System.out.print(a);
        a = bar(a - 1);
        return a;
    }

    static int bar(int a) {
        System.out.print(a);
        return a + 2;
    }
}
