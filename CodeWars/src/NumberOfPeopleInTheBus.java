/**
 * По городу движется автобус, который на каждой остановке забирает и высаживает несколько человек.
 * Вам предоставляется список (или массив) пар целых чисел.
 * Элементы каждой пары представляют собой количество людей, входящих в автобус (первый элемент)
 * и количество людей, выходящих из автобуса (второй элемент) на остановке.
 * Ваша задача — вернуть количество людей, которые все еще находятся в автобусе
 * после последней остановки (после последнего массива).
 * Несмотря на то, что это последняя автобусная остановка, автобус может быть не пустым,
 * и в автобусе все еще могут быть люди, они, вероятно, там спят :D
 */
import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        System.out.println(countPassengers(list));
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        int passengers = 0;
        for (int[] stop : stops) {
            passengers += stop[0];
            passengers -= stop[1];
        }
        return passengers;
    }
}
