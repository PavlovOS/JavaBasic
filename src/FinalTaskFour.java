import java.util.Scanner;

public class FinalTaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Отгадайте загадку: \"Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает\"");
        String answer1 = "Заархивированный вирус";
        String answer2 = "Подсказка";
        boolean result = false;
        boolean hint = false;
        for (int i = 1; i <= 3; ) {
            System.out.print("Введите ответ: ");
            String text = input.nextLine();
            if (answer1.equals(text)) {
                result = true;
                break;
            } else if ((answer2.equals(text)) && (i == 1)) {
                System.out.println("Заархивированный вирус");
                hint = true;
                i = 3;
            } else if (answer2.equals(text)) {
                System.out.println("Подсказка уже недоступна");
            } else if ((!hint) && (i != 3)) {
                System.out.println("Подумай еще!");
                i++;
            } else i++;
        }
        if (result) {
            System.out.println("Правильно!");
        } else {
            System.out.println("Обидно, приходи в другой раз.");
        }
    }
}
