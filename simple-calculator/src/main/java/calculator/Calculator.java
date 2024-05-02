package calculator;

public class Calculator {
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int factorial(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }
    
}
