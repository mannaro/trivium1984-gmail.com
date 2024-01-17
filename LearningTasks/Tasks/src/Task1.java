package LearningTasks.Tasks.src;

//Задачка, в которой переворачивается
//каждое отдельное слово в введеном выражении
public class Task1 {
    public static void main(String[] args) {
        System.out.println(stringReverse("This is an example!"));
    }

    public static String stringReverse(String string) {
        String result = "";
        String[] strings = string.split(" ");

        for (int i = 0; i < strings.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(strings[i]);
            stringBuilder.reverse();
            result += stringBuilder.toString() + " ";
        }

        return result.trim();
    }
}
