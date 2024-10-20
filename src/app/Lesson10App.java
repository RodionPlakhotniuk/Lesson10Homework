import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Lesson10App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1.
        System.out.println("1.Метод для квадрату числа");
        System.out.println("Введіть ціле число:");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.printf("Квадрат числа %d дорівнює %d. \n", a, squareNumbers(a));
        //2.
        System.out.println();
        System.out.println("2.Метод для обчислення об'єму циліндра");
        cylinderVolume(6.5, 12);
        System.out.println();
        //3.
        System.out.println("3.Метод для суми масиву");
        int[] arrayOne = new int[5];
        sumToArray(arrayOne);
        System.out.println();
        //4.
        System.out.println("4.Метод повертає рядок у зворотньому порядку.");
        System.out.println("Ведіть текст");
        String lineOne = scan.nextLine();
        System.out.println("Ведений рядок: " + lineOne);
        System.out.println("Рядок в зворотньому порядку: " + lineOpposite(lineOne));
        System.out.println();
        //5.
        System.out.println("5.Метод, який підіймає число a в ступінь b");
        System.out.println("Ведіть перше число");
        int firstNumber = scan.nextInt();
        System.out.println("Ведіть друге число");
        int secondNumber = scan.nextInt();
        System.out.printf("Число a: %d\n" +
                        "Число b: %d\n" +
                        "Результат %d в ступені %d дорівнює %d.\n", firstNumber, secondNumber, firstNumber,
                secondNumber, upToTheDegree(firstNumber, secondNumber));
        System.out.println();
        //6.
        System.out.println("6.Метод, який виводить рядок n кількість раз, яку оберав користувач");
        System.out.println("Введіть ціле число:");
        int quantity = scan.nextInt();
        scan.nextLine();
        System.out.println("Ведіть текст");
        String text = scan.nextLine();
        System.out.println("Ведене число: " + quantity);
        System.out.println("Ведений рядок: " + text);
        viewOfTheRow(quantity, text);

    }

    //1.Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
    public static int squareNumbers(int a) {
        int result = a * a;
        return result;
    }

    //2.Напишіть метод, який приймає два аргументи типу
    //double - радіус та висоту - і повертає об'єм циліндра. Виведіть об'єм циліндра на екран.
    public static double cylinderVolume(double radius, double height) {
        double volume = Math.PI * (radius * radius) * height;
        System.out.printf("Об'єм циліндра з радіусом %.1f і" +
                " висотою %.0f дорівнює %f.\n", radius, height, volume);
        return volume;
    }

    //3.Напишіть метод,
    // який приймає масив цілих чисел та обчислює і повертає суму всіх елементів масиву.
    public static int sumToArray(int[] index) {
        Random random = new Random();
        int sumArray = 0;
        for (int i = 0; i < index.length; i++) {
            index[i] = random.nextInt(100) + 1;
            sumArray += index[i];
        }

        System.out.println("Масив чисел: " + Arrays.toString(index));
        System.out.println("Сума всіх елементів масиву дорівнює " + sumArray + ".");
        return sumArray;
    }

    //4.Напишіть метод, який приймає рядок (String) як аргумент та повертає новий
   // рядок, який складається з букв цього рядка у зворотньому порядку.
    public static String lineOpposite(String line) {
        String reversed = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            reversed += line.charAt(i);
        }
        return reversed;
    }

    //5.Напишіть метод, який приймає два цілих числа, a та b, і повертає
    // результат a^b (a підняте до степеня b).
    public static int upToTheDegree(int a, int b) {
        int number = (int) Math.pow(a, b);
        return number;
    }

    //6.Напишіть метод, який приймає параметри: ціле число n і
    // рядок text. Метод повинен вивести текстовий рядок text n рази, розділяючи кожен рядок символом переносу.
    public static void viewOfTheRow(int numbers, String lines) {
        for (int i = 0; i < numbers; i++) {
            System.out.print(lines + "\n");
        }
    }
}
