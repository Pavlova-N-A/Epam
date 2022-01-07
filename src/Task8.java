import java.util.Scanner;

//Найти max{min(a, b), min(c, d)}.
public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //даём возможность ввода переменной с клавиатуры
        System.out.println("Введите значение переменной а: "); // просим ввести значение переменной а
        double a = in.nextDouble();
        System.out.println("Введите значение переменной b: "); // просим ввести значение переменной b
        double b = in.nextDouble();
        double min_1 = Math.min(a, b); // ищем минимальное из двух введённых раньше значений
        System.out.println("Минимальное из данных значений: " + min_1); // выводим на экран минимальное из двух введённых ранее значений
        System.out.println("Введите значение переменной с: "); // просим ввести значение переменной с
        double c = in.nextDouble();
        System.out.println("Введите значение переменной d: ");// просим ввести значение переменной d
        double d = in.nextDouble();
        double min_2 = Math.min(c, d); // ищем минимальное из двух указанных выше (ещё не найденных) значений
        System.out.println("Минимальное из данных значений: " + min_2); // выводим на экран минимальное из этих двух значений
        double max = Math.max(min_1, min_2); // задаём переменную, которая ищет максимальное из двух минимальных значений
        System.out.println("Искомое значение: " + max); // выводим на экран искомое число (максимальное из минимальных значение)
    }
}
