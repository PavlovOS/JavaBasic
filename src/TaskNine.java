import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        double[] newArray = new double[input.nextInt()];
        double x = 0;
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Введите " + (i + 1) + " значение массива ");
            newArray[i] = input.nextDouble();
            x += newArray[i];
        }
        x = x / newArray.length;
        for (int j = 0; j < newArray.length; j++) {
            String m = String.format(Locale.US,"%.2f", newArray[j] * x);
            newArray[j] = Double.parseDouble(m);
        }
        System.out.println(Arrays.toString(newArray));
    }
}
