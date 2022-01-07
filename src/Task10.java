import java.util.Scanner;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.
public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // даём возможность ввода переменных с клавиатуры
        System.out.println("Введите значения A: "); // просим ввести значение переменной А
        double A = in.nextDouble();
        System.out.println("Введите значения B: ");// просим ввести значение переменной В
        double B = in.nextDouble();
        System.out.println("Введите значения x: ");// просим ввести значение переменной х
        double x = in.nextDouble();
        System.out.println("Введите значения y: ");// просим ввести значение переменной у
        double y = in.nextDouble();
        System.out.println("Введите значения z: ");// просим ввести значение переменной z
        double z = in.nextDouble();
        if (x <= A && y <= B || y <= A && x <= B || x <= A && z <= B || z <= A && x <= B || z <= A && y <= B || y <= A && z <= B){ //условие, при котором кирпич проходит через отверстие
            System.out.println("Кирпич проходит через отверстие."); // если условие выполняется выводит это
        } else {
            System.out.println("Кирпич не проходит через отверстие."); // если условие не выполняется  выводит это
        }
    }
}
