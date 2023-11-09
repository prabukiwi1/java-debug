public class ComplexMethodOverloading {
    public void calculate(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Result: " + result);
    }

    public void calculate(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    public void calculate(String text1, String text2) {
        System.out.println("Combined Text: " + text1 + text2);
    }

    public void calculate(int num1, int num2, int num3) {
        int result = num1 * num2 * num3;
        System.out.println("Result: " + result);
    }

    public void calculate(int[] numbers) {
        int result = 0;
        for (int i = 0; i <= numbers.length; i++) {
            result += numbers[i];
        }
        System.out.println("Result: " + result);
    }

    public void calculate(double num1, double num2, double num3) {
        double result = num1 / num2;
        System.out.println("Result: " + result);
    }

    public void calculate(String text) {
        System.out.println("Text: " + text);
    }

    public void calculate(int num1, double num2) {
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    public void calculate(double num1, int num2) {
        int result = (int) (num1 * num2);
        System.out.println("Result: " + result);
    }

    public void calculate(int num1, int num2, int num3, int num4) {
        int result = num1 + num2 + num3 + num4;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        ComplexMethodOverloading calculator = new ComplexMethodOverloading();

        calculator.calculate(5, 10);
        calculator.calculate(3.5, 2.0);
        calculator.calculate("Hello", "World");
        calculator.calculate(2, 3, 4);
        calculator.calculate(new int[]{1, 2, 3});
        calculator.calculate(7.0, 0.0);
        calculator.calculate("Java");
        calculator.calculate(4, 1.5);
        calculator.calculate(2.5, 3);
        calculator.calculate(1, 2, 3, 4, 5);
    }
}

