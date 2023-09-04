package seminar_2.homework;

public class Task2 {
    public static void main(String[] args) {
//        добавлен исходный массив с данными для проверки метода на разных данных
        int[] intArray = {2, 45, 3, 12, 98, 34, 21};
        int d = 6;
            /* Целесообразнее делать не обработку исключений в блоках try-catch,
        а реализовать в коде проверку значения делителя на 0 с помощью конструкции if().
        Аналогично лучше поступить и с проверкой значения индекса при обращении к элементу массива,
        сравнив его с длинной массива в блоке if()
        */
        if (d == 0) {
            System.out.println("Деление на 0 недопустимо! Необходимо изменить значение делителя d!");
        } else if (8 >= intArray.length) {
            System.out.println("Попытка обращения к элементу массива за пределами массива!\nУкажите иной индекс массива!");
        } else {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }

        /* В случае выбора варианта обработки возможных ошибок с помощью блока try-catch необходимо добавить
            дополнительный класс исключений ArrayIndexOutOfBoundsException в блок catch(),
            т.к. при вычислении частного возможно обращение по индексу к элементу массива за пределами размера массива.
            Обработка исключения при этом может быть одинакова для обоих видов исключения,
            т.к. будет выводиться информация об исключении,
            которое фактически будет иметь место в зависимости от ситуации.

        try {
            int d = 0;
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }*/
    }
}