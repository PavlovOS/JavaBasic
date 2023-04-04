import java.util.Scanner;

public class FinalTaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int lines = input.nextInt();
        input.nextLine();
        String[] line = new String[lines];
        for (int i = 0; i < lines; i++) {
            System.out.print("Строка № " + (i + 1) + ": ");
            line[i] = input.nextLine();
        }
        int index = 0;
        int count = 0;
        for (int j = 0; j < line.length; j++) {
            String word = line[j].toLowerCase();
            int count2 = 0;
            for (int l = 0; l < word.length(); ) {
                word = word.replace(String.valueOf(word.charAt(l)), "");
                count2++;
            }
            if (count2 > count) {
                count = count2;
                index = j;
            }
        }
        System.out.println(line[index]);
    }
}
