import java.util.OptionalInt;
import java.util.Random;

public class TaskFourteen {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        Random rand = new Random();
        int min = 20;
        int max = -20;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.ints(max, min + 1).findFirst().getAsInt();
        }
        for (int j : myArray) {
            if (j < min) min = j;
            if (j > max) max = j;
        }
        //Выведите максимальный и минимальный элемент массива.
        System.out.println("MAX = " + max + " MIN = " + min);
        //Из максимального и минимального значения выведите наибольшее по модулю.
        System.out.println("Максимальное значение по модулю = " + Math.max(max, Math.abs(min)));
    }
}
