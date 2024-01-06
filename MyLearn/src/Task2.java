// Задача: Создайте класс Task2, содержащий метод findMax,
// который принимает массив целых чисел и возвращает максимальное значение в этом массиве.
// В данной задаче вам необходимо реализовать метод findMax,
// который принимает массив целых чисел numbers и возвращает максимальное значение в этом массиве.
// Вам нужно написать код, который будет искать максимальное значение и возвращать его.


public class Task2 {
    private static int[] numbers = new int[]{2, 3, 12, 7, 5, 9};

    public static void main(String[] args) {
        System.out.println(findMax(numbers));
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
        }
        return max;
    }

}



