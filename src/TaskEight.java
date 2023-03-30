import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число ");
        int n = input.nextInt();
        int x = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                x += i;
            }
        }
        System.out.println("Сумма всех нечетных чисел = " + x);
    }
}
