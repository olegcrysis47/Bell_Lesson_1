package aristovo.project;

public class Calculator {

    public static int calculate(int num1, int num2, String str) {
        switch (str) {
            case "+":
                return addition(num1, num2);
            case "-":
                return subtraction(num1, num2);
            case "*":
                return multiplication(num1, num2);
            case "/":
                return division(num1, num2);
            case "%":
                return remains(num1, num2);
            default:
                System.out.println("Unknown operator!");
                return 0;
        }
    }

    //сложение
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    //вычитание
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    //умножение
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    //деление
    public static int division(int num1, int num2) {
        //Предусмотреть деление на 0
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
            return 0;
        }
    }

    //остаток от деления
    public static int remains(int num1, int num2) {
        return num1 % num2;
    }

}
