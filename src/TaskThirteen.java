import java.util.Scanner;

public class TaskThirteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку из слов, разделенных пробелами");
        String[] line = (input.nextLine()).split(" ");
        //Выведите слова, состоящие только из латиницы.
        StringBuilder line2 = new StringBuilder();
        int num = 0;
        for (String s : line) {
            if (s.matches("[a-zA-Z]+")) {
                line2.append(s).append(" ");
                num++;
            }
        }
        System.out.println(line2);
        //Выведите количество этих слов.
        System.out.println("Количество слов = " + num);
    }
}
