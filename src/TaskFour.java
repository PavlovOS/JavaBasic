import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        //Ввести три числа с клавиатуры x, y, z
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number X ");
        double x = input.nextDouble();
        System.out.println("Enter number Y ");
        double y = input.nextDouble();
        System.out.println("Enter number Z ");
        double z = input.nextDouble();
        //Найти и вывести в консоль среднее арифметическое этих чисел
        double sr = (x + y + z)/3;
        System.out.println("Arithmetic mean = " + sr);
        //Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        double result = Math.floor(sr/2);
        //Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
