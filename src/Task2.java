import java.util.Scanner;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // даём возможность ввести значение с клавиатуры
        System.out.println("Введите значение переменной а: "); // просим написать с клавиатуры значение переменной а
        double a = in.nextDouble(); // вводим с клавиатуры значение переменной а
        System.out.println("Введите значение переменной b: "); // просим написать с клавиатуры значение переменной b
        double b = in.nextDouble(); // вводим с клавиатуры значение переменной b
        System.out.println("Введите значение переменной с: "); // просим написать с клавиатуры значение переменной с
        double c = in.nextDouble(); // вводим с клавиатуры значение переменной с
        double z = (b+Math.sqrt(Math.pow(b, 2)+4*a*c))/(2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2); // z - выражение, требующее решения
        System.out.println(z); // выводим значение выражения
    }
}
