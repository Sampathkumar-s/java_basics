public class AllOperatorsDemo {
    public static void main(String[] args) {

        int a = 10, b = 5;
        int x = 4, y = 2;
        boolean p = true, q = false;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Unary Operators
        System.out.println("\nUnary Operators");
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));
        System.out.println("a++ = " + (a++));
        System.out.println("b-- = " + (b--));
        System.out.println("After increment/decrement: a = " + a + ", b = " + b);

        // Assignment Operators
        System.out.println("\nAssignment Operators");
        int c = 10;
        c += 5;
        System.out.println("c += 5 : " + c);
        c -= 3;
        System.out.println("c -= 3 : " + c);
        c *= 2;
        System.out.println("c *= 2 : " + c);
        c /= 4;
        System.out.println("c /= 4 : " + c);
        c %= 3;
        System.out.println("c %= 3 : " + c);

        // Relational Operators
        System.out.println("\nRelational Operators");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical Operators
        System.out.println("\nLogical Operators");
        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p : " + (!p));

        // Bitwise Operators
        System.out.println("\nBitwise Operators");
        System.out.println("x & y = " + (x & y));
        System.out.println("x | y = " + (x | y));
        System.out.println("x ^ y = " + (x ^ y));
        System.out.println("~x = " + (~x));

        // Shift Operators
        System.out.println("\nShift Operators");
        System.out.println("x << 1 = " + (x << 1));
        System.out.println("x >> 1 = " + (x >> 1));

        // Ternary Operator
        System.out.println("\nTernary Operator");
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);

        
    }
}