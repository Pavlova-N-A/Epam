import java.util.Scanner;

// Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.
public class Task12 {
    public static void main(String[] args) {
        int sum = 0; // присваеваем переменной sum значение 0
        Scanner in = new Scanner(System.in); // даём возможность ввода переменной с клавиатуры
        System.out.println("Введите целое положительное число: "); // просим ввести целое положительное число (по условию задачи)
        int number = in.nextInt();
        for (int i = 1; i <= number ; i++) { // ставим условие, что цикл будет суммировать все числа от одного до введённого числа
            sum = sum + i; // ищём сумму
        }
            System.out.println("Сумма всех чисел от 1 до выбранного числа равна: " + sum); // выводим сумму на экран
        }
    }
