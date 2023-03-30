import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        //Пользователь вводит размер массива и данные с клавиатуры в массив
        //Сравнить элементы массива с заранее заданными константами x, y, z
        Scanner input = new Scanner(System.in);
        final int x = 18, y = 5, z = 96;
        boolean const1 = false;
        System.out.println("Введите размер массива");
        int[] newArray = new int[input.nextInt()];
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Введите " + (i + 1) + " значение массива ");
            newArray[i] = input.nextInt();
            if (!const1 && (newArray[i] == x || newArray[i] == y || newArray[i] == z)) {
                const1 = true;
                }
            }
        //Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
        if (const1) {
            System.out.println("Данное значение имеется в константах");
        }
    }
}
