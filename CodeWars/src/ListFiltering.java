import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Создайте функцию, которая принимает список неотрицательных целых чисел и строк
 * и возвращает новый список с отфильтрованными строками.
 * Пример:
 * Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
 */
public class ListFiltering {
    public static void main(String[] args) {
        List<Object> mixedList = new ArrayList<>();

        // Добавляем неотрицательные целые числа
        mixedList.add(1);
        mixedList.add(2);
        mixedList.add("a");
        mixedList.add("b");
        mixedList.add(0);
        mixedList.add(15);

        System.out.println(filterList(mixedList));

    }
    public static List<Object> filterList(final List<Object> list) {
        List<Object> newList = new ArrayList<>();
        for (Object o : list) {
            if (o instanceof Integer) {
                newList.add(o);
            }
        }
        return newList;
    }
}
