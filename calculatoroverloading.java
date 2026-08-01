class Calculator{

    static int count = 0;

    // Addition of integers
    void add(int a, int b) {
        count++;
        System.out.println("Integer Addition: " + (a + b));
    }

    // Addition of decimals
    void add(double a, double b) {
        count++;
        System.out.println("Decimal Addition: " + (a + b));
    }

    // Static method
    static void showCount() {
        System.out.println("Total Calculations: " + count);
    }
}

public class  calculatoroverloading{

    public static void main(String args[]) {

        Calculator c = new Calculator();

        c.add(10, 20);          // Integer addition
        c.add(5.5, 3.2);        // Decimal addition

        Calculator.showCount();
    }
}