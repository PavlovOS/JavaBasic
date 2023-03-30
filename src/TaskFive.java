import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        //Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        double x = input.nextDouble();
        System.out.println("Enter the second number ");
        double y = input.nextDouble();
        System.out.println("Enter one of the symbol: ‘+’, ‘-’, ‘*’, ‘/’ ");
        String str = input.next();
        //В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции
        switch (str) {
            case "+" -> System.out.println("Result = " + (x + y));
            case "-" -> System.out.println("Result = " + (x - y));
            case "*" -> System.out.println("Result = " + (x * y));
            case "/" -> System.out.println("Result = " + (x / y));
        }
    }
}
