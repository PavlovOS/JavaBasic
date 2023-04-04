import java.util.Scanner;

public class FinalTaskOne {
    public static void main(String[] args) {
        //Программа должна переводить рубли в доллары по текущему курсу.
        Scanner input = new Scanner(System.in);
        //Пользователь вводит текущий курс и количество рублей.
        System.out.print("Курс доллара: ");
        double exchange = input.nextDouble();
        System.out.print("Количество рублей: ");
        double rub = input.nextDouble();
        //Итоговое значение должно быть округлено до двух знаков после запятой.
        double result = rub / exchange;
        System.out.print("Итого: " + String.format("%.2f", result) + " долларов");
    }
}
