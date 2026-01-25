class DataOperations {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("Arithmetic Operators");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

	System.out.println(" ");

        System.out.println("Unary Operators");
        int x = 5;
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x));
        System.out.println("x++ = " + (x++));
        System.out.println("--x = " + (--x));
        System.out.println("x-- = " + (x--));

	System.out.println(" ");

        System.out.println("Relational Operators");
        System.out.println("a < b  = " + (a < b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a > b  = " + (a > b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

	System.out.println(" ");

        System.out.println("Logical Operators");
        boolean p = true;
        boolean q = false;

        System.out.println("p && q = " + (p && q));
        System.out.println("p || q = " + (p || q));
        System.out.println("!p     = " + (!p));
    }
}
