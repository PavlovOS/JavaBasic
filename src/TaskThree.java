public class TaskThree {
    public static void main(String[] args) {
        //Задайте массив из 5 любых целых чисел
        int[] myArray = new int[] {1,2,3,4,5};
        //Поменяйте местами первый и последний элемент в массиве
        int i = myArray[0];
        myArray[0] = myArray[myArray.length-1];
        myArray[myArray.length-1] = i;
        //Вывести в консоль результат суммы первого и среднего элемента
        System.out.println(myArray[0] + myArray[myArray.length/2]);
    }
}
