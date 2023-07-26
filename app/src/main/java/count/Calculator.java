
package count;

import java.util.Scanner;

public class Calculator {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = calculator.getInt();
        int b = calculator.getInt();
        char operator = calculator.getOperation();
        System.out.println("Результат: " + calculator.calculation(a, b, operator));
    }

    private int getInt() {
        int number;
        System.out.print("Введіть число: ");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.print("Введіть число: ");
            scanner.next();
            number = scanner.nextInt();
        }
       return number;
    }

    public char getOperation() {
        System.out.println("Введіть одну із операцій (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        return operator;
    }

    public int calculation(int a, int b, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = subtract(a, b);
                break;
            case '*':
                result = multiply(a, b);
                break;
            case '/':
                result = divide(a, b);
                break;
            default:
                System.out.println("Помилка! Невірна операція!");
                break;
        }
        return result;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Помилка! Ділення на нуль не можливе!");
        }
        return a / b;
    }
}
