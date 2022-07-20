package aristovo.project;

import java.util.Scanner;

import static aristovo.project.Calculator.calculate;

/**
 * Сделать мини-проект консольный калькулятор, поддерживающий операции: +, -, *, /.
 * Калькулятор принимает на вход два числа и знак операции (+, -, *, /), если был подан другой знак выводится ошибка.
 * В результате вычислений выводится фраза подобного формата: 2 + 3 = 5.
 * Программа работает до тех пор пока пользователь не напишет команду stop.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        int count = 0;
        int num1 = 0;
        int num2 = 0;

        while (!(str = sc.nextLine()).equals("stop")) {
            if (isNumeric(str)) {
                if (count == 0) {
                    num1 = Integer.parseInt(str);
                    count++;
                } else {
                    num2 = Integer.parseInt(str);
                    count = 0;
                }
            } else {
                System.out.println(num1 + " " + str + " " + num2 + " = " + calculate(num1, num2, str));
            }
        }

        sc.close();
    }

    //Проводим проверку является ли строка числом
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
