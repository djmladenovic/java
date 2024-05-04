package calculator;

public class Calculator {
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int factorial(int a) {
        if (a == 1) {
            return 0; // namerna greska
        } else {
            return a * factorial(a - 1);
        }
    }
    
}
