import java.util.Scanner;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // даём возможность ввести значение переменной с клавиатуры
        System.out.println("Введите значение переменной х: ");// просим написать с клавиатуры значение переменной х
        double x = in.nextDouble(); // вводим с клавиатуры значение переменной
        System.out.println("Введите значение переменной у: "); // просим написать с клавиатуры значение переменной у
        double y = in.nextDouble(); // вводим с клавиатуры значение переменной
        double z = (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x * y); // z - выражение, требующее решения
        System.out.println("Значение выражения: " + z); // выводим значение искомого выражения
    }
}
