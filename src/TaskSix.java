import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        //Пользователю предлагается на выбор ввести массу или расстояние.
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        //Пользователю предлагается выбрать единицу измерения.
        int unit1 = 0, unit2 = 0;
        if (input.nextInt() == 1) {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - центнер, 4 - тонна");
            unit1 = input.nextInt();
        } else {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            unit2 = input.nextInt();
        }
        //Пользователю предлагается ввести количество выбранных единиц.
        System.out.println("Введите количество ");
        double quantity = input.nextInt();
        switch (unit1) {
            case 1 -> System.out.print("Граммы - " + quantity + "\n" + "Килограммы - " + quantity/1000 + "\n" + "Центнеры - " + quantity/100000 + "\n" + "Тонны - " + quantity/1000000);
            case 2 -> System.out.print("Граммы - " + quantity*1000 + "\n" + "Килограммы - " + quantity + "\n" + "Центнеры - " + quantity/100 + "\n" + "Тонны - " + quantity/1000);
            case 3 -> System.out.print("Граммы - " + quantity*100000 + "\n" + "Килограммы - " + quantity*100 + "\n" + "Центнеры - " + quantity + "\n" + "Тонны - " + quantity/10);
            case 4 -> System.out.print("Граммы - " + quantity*1000000 + "\n" + "Килограммы - " + quantity*1000 + "\n" + "Центнеры - " + quantity*10 + "\n" + "Тонны - " + quantity);
        }
        switch (unit2) {
            case 1 -> System.out.print("Метры - " + quantity + "\n" + "Мили - " + quantity*0.000621 + "\n" + "Ярды - " + quantity*1.093613 + "\n" + "Футы - " + quantity*3.28084);
            case 2 -> System.out.print("Метры - " + quantity*1609.34 + "\n" + "Мили - " + quantity + "\n" + "Ярды - " + quantity*1760 + "\n" + "Футы - " + quantity*5280);
            case 3 -> System.out.print("Метры - " + quantity*0.9144 + "\n" + "Мили - " + quantity/1760 + "\n" + "Ярды - " + quantity + "\n" + "Футы - " + quantity*3.000001);
            case 4 -> System.out.print("Метры - " + quantity*0.30479999 + "\n" + "Мили - " + quantity/5280 + "\n" + "Ярды - " + quantity*0.333333 + "\n" + "Футы - " + quantity);
        }
    }
}
