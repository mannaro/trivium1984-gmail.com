package LearningTasks.Tasks.src;

//Используя цикл for, выведите в столбик строки вида “Олимпиада year года”,
//где year - это число, которое принимает значения, начиная от 1980 до 2020,
// с шагом увеличения равным 4. То есть на первой итерации цикла,
// year равен 1980, а на каждой следующей итерации, значение year увеличивается на 4.
//Строки такого вида выводятся до тех пор, пока значение year не станет больше 2020.

public class Taks7 {
    public static void main(String[] args) {
        for (int year = 1980; year <= 2020; year+= 4) {
            System.out.println("Олимпиада " + year + " года");
        }
    }
}
