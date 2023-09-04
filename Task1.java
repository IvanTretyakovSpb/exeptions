package seminar_2.homework;

import java.util.Scanner;

//        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
//        необходимо повторно запросить у пользователя ввод данных.
public class Task1 {
    public static void main(String[] args) {
        System.out.println(getNumber());
    }

    public static float getNumber() {
        while (true) {
            System.out.println("Enter a fractional number: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextFloat()) {
                return scanner.nextFloat();
            }
            System.out.println("Invalid value entered!");
        }
    }
}
