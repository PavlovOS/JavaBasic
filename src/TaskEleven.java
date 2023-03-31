import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        //Ввести первое число с клавиатуры и записать его в строковую переменную.
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число");
        String x = Integer.toString(input.nextInt());
        //Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        System.out.println("Введите второе число");
        int y = input.nextInt();
        //Сравнить 2 числа и вывести большее на экран.
        //Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
        if (Integer.parseInt(x) > y) {
            System.out.println(x);
            System.out.println((double) y);
        } else {
            System.out.println(y);
            System.out.println(Double.parseDouble(x));
        }
    }
}
