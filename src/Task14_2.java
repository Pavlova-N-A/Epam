//Найти сумму квадратов первых ста чисел
public class Task14_2 {
    public static void main(String[] args) {
        int n = 1; //присваеваем переменной значение равное 1 (первое число от которого отсчёт)
        int sum = 0; //присваеваем переменной значение раное 0
        while (n <= 100) { //пока n не примет значение равное 100 - цикл будет продолжаться
            sum = (sum + n*n); //указываем, что нам нужна сумма квадратов чисел
            n++; //прибавляем к переменной 1 до того момента, пока 1 не будет равна 100
        }
        System.out.println(sum); //выводим на экран значение
    }
}