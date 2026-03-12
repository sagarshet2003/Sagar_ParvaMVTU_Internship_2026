package Operators;

public class Operators{
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // 1. Arithmetic Operators
        
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Relational Operators
        
        System.out.println("Relational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // 3. Logical Operators
        
        boolean x = true;
        boolean y = false;

        System.out.println("Logical Operators:");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        // 4. Assignment Operators
        
        int c = 20;
        System.out.println("Assignment Operators:");
        c += 5;
        System.out.println("c += 5 : " + c);
        c -= 3;
        System.out.println("c -= 3 : " + c);

        // 5. Unary Operators
        
        int d = 7;
        System.out.println("Unary Operators:");
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d));
        System.out.println("--d = " + (--d));

        // 6. Ternary Operator
        
        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator:");
        System.out.println("Maximum of a and b = " + max);
    }
}
