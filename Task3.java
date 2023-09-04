package seminar_2.homework;

public class Task3 {
    //    Из метода main удаляем throws Exception,
//    т.к. выше уже некуда пробрасывать возможные исключения для дальнейшей обработки
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;

//      В блоке catch удалена первоочередная обработка Throwable ex,
//      т.к. она перекрывала бы всю остальную обработку исключений и при этом была бы совсем неинформативна.
//      Добавлена обработка таких классов исключений как IllegalArgumentException и ArithmeticException,
//      т.к. в коде возможно деление на 0 в строке 11,
//      а при вызове метода printSum возможно некорректное указание аргументов, как и обращение к null.

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null! " + ex);
        } catch (IllegalArgumentException ex) {
            System.out.println("Введены некорректные значения аргументов метода! " + ex);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера! " + ex);
        } catch (ArithmeticException ex) {
            System.out.println("Деление на 0 недопустимо! " + ex);
        }
        //      Кроме того, возможно целесообразней разбить достаточно большой код, указанный в блоке try,
//      на 3 отдельных, тематически связанных блока try():
//      деление, обращение к методу printSum и работа с массивом
    }

    //    В методе printSum изменяем вид выбрасываемого исключения с FileNotFoundException на
//    NullPointerException и IllegalArgumentException, т.к. обращения к файлу в методе нет,
//    а значения аргументов могут быть введены некорректные.
    public static void printSum(Integer a, Integer b) throws NullPointerException, IllegalArgumentException {
        System.out.println(a + b);
    }

}
