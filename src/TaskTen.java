import java.util.Arrays;
import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер матрицы X на Y, через запятую");
        double xy = input.nextDouble();
        int x = (int) xy;
        int y = (int) Math.round((xy - x)*10);
        int[][] matrix = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Введите " + (j + 1) + " значение в массив " + (i + 1));
                matrix[i][j] = input.nextInt();
            }
        }
        for (int n = 0; n < y; n++) {
            matrix[0][n] *= 3;
        }
        System.out.println(Arrays.toString(matrix[0]));
    }
}
