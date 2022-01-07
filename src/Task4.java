import java.util.Scanner;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.
public class Task4 {
    public static void main(String[] args) {
        double x; // вводим переменную х
        System.out.println("Введите число х вида nnn.ddd:"); // просим ввести число вида nnn.ddd
        Scanner in = new Scanner(System.in); // даём возможность для ввода числа вида nnn.ddd с клавиатуры
        x = in.nextDouble();
        double n = (int) x;
        double result = n / 1000 + (x - n) * 1000;
        System.out.println(result);
    }
}
