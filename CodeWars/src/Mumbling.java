/**
 * На этот раз ни истории, ни теории. В примерах ниже показано, как написать функцию accum:
 * Примеры:
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 * Параметр accum представляет собой строку, включающую только буквы от a..zи A..Z.
 */

public class Mumbling {
    public static void main(String[] args) {
        String s = "abcd";
        String S = accum(s);
        System.out.println(S);
    }

    public static String accum(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i > 0) {
                stringBuilder.append("-");
            }
            stringBuilder.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++) {
                stringBuilder.append(Character.toLowerCase(c));
            }
        }
        return stringBuilder.toString();
    }
}
