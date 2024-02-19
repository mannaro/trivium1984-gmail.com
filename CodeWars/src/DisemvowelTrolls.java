/**
 * Тролли атакуют ваш раздел комментариев!
 * Распространенный способ справиться с этой ситуацией —
 * удалить все гласные из комментариев троллей, нейтрализуя угрозу.
 * Ваша задача — написать функцию, которая принимает строку
 * и возвращает новую строку, из которой удалены все гласные.
 * Например, строка «This website is for losers LOL!» станет «Ths wbst s fr lsrs LL!».
 * Примечание: для этой ката "y" не считается гласной.
 */
public class DisemvowelTrolls {
    public static void main(String[] args) {
        String testStr = "This website is for losers LOL!";
        System.out.println(disemvowel(testStr));
    }

    public static String disemvowel(String str) {
        String[] vowels = {"A","E","I","O","U","a","e","i","o","u"};
        for (String vowel : vowels) {
            str = str.replace(vowel, "");
        }
        return str;
    }
}
    //Решение с использованием регулярного выражения:
    //public class Troll {
    //    public static String disemvowel(String str) {
    //        return str.replaceAll("[aAeEiIoOuU]", "");
    //    }
    //}
