import java.util.Scanner;

//Вычислить значение функции
public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in); //даём возможность ввести значение переменной с клавиатуры
        System.out.println("Введите значение х: "); // просим ввести значение переменной х
        double x = in.nextDouble();
        if (x <= 3){ //ставим условие (что х должно быть меньше или равно 3), при выполнении которого, будет выполняться следующее выражение
            System.out.println(Math.pow(x, 2) - 3*x + 9); //вот это выражение
        }
        else { // если условие, поставленное ранее, не выполнено (х оказалось строго больше 3) - выполняется нижеуказанное выражение
            System.out.println(1/(Math.pow(x, 3) + 6));
        }
    }
}
