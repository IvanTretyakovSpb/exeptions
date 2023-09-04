package seminar_2.homework;

import java.util.Scanner;

//        Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {
    public static void main(String[] args) {
        try {
            getLineFromUser();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getLineFromUser() throws Exception {
        System.out.println("Введите какие-либо значения в строку (текст, числа, символы): ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.isBlank()) {
            throw new Exception("Ввод пустых строк запрещён!");
        }
        System.out.println("Введена следующая строка:\n" + line);
    }
}