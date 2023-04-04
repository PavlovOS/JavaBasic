import java.util.Scanner;

public class FinalTaskTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String equation = input.nextLine();
        int x = equation.indexOf('x');
        int result = 0;
        switch (x) {
            case 0 -> {
                if (equation.charAt(1) == '+') {
                    result = Integer.parseInt(String.valueOf(equation.charAt(4))) - Integer.parseInt(String.valueOf(equation.charAt(2)));
                } else {
                    result = Integer.parseInt(String.valueOf(equation.charAt(4))) + Integer.parseInt(String.valueOf(equation.charAt(2)));
                }
            }
            case 2 -> {
                if (equation.charAt(1) == '+') {
                    result = Integer.parseInt(String.valueOf(equation.charAt(4))) - Integer.parseInt(String.valueOf(equation.charAt(0)));
                } else {
                    result = -(Integer.parseInt(String.valueOf(equation.charAt(4))) - Integer.parseInt(String.valueOf(equation.charAt(0))));
                }
            }
            case 4 -> {
                if (equation.charAt(1) == '+') {
                    result = Integer.parseInt(String.valueOf(equation.charAt(0))) + Integer.parseInt(String.valueOf(equation.charAt(2)));
                } else {
                    result = Integer.parseInt(String.valueOf(equation.charAt(0))) - Integer.parseInt(String.valueOf(equation.charAt(2)));
                }
            }
        }
        System.out.println(result);
    }
}
