/**
 *  Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner,
 *  число, соответствующее количеству этажей в здании. Используя условный оператор if,
 *  необходимо вывести в консоль сообщение о типе такого дома.
 *  Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более - “Многоэтажный дом”.
 *  Также, необходимо учесть что может быть введено отрицательное значение, в таком случае сообщить “Ошибка ввода”.
 */
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0 && number <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (number >= 5 && number <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (number > 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
        scanner.close();
    }
}