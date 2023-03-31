public class TaskTwelve {
    public static void main(String[] args) {
        likeJava("I like Java!!!");
    }
    public static void likeJava(String args) {
        //Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        //Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        //Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        //Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        if ((args.contains("Java")) && (args.startsWith("I like")) && (args.endsWith("!!!"))) {
            System.out.println(args.toUpperCase());
        }
        //Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
        args = args.replace('a', 'o');
        System.out.println(args.substring(args.length()-7, args.length()-3));
    }
}
