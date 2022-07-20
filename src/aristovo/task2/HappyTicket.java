package aristovo.task2;

import java.util.Scanner;

/**
 * На вход дано шестизначное число (номер билета), проверить,
 * что билет является счастливым (сумма первых трёх цифры равна сумме последних трёх цифр).
 */
public class HappyTicket {

    public static void main(String[] args) {

        //ввод числа в консоли
        System.out.println("Enter your ticket number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        //счетчик разрядов
        int count = 1;
        //переменные для суммирования цифр разрядов числа
        int firstNum = 0;
        int secondNum = 0;

        while (number != 0) {
            if (count <= 3) {
                firstNum += number % 10;
                number /= 10;
                count++;
            } else {
                secondNum += number % 10;
                number /= 10;
            }
        }

        if (firstNum == secondNum) {
            System.out.println("Congratulation! Your ticket is HAPPY!");
        } else {
            System.out.println("Sorry! Your ticket is NOT happy!");
        }

    }
}
