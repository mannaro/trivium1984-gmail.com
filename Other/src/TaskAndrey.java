package Other.src;

import java.io.*;

public class TaskAndrey {


    public static final String TRUE_TRUE_TRUE = "Результат: быстро, качественно и не дорого, такого не бывает";
    public static final String TRUE_FALSE_TRUE = "Результат: быстро и не дорого, но качество хромает";
    public static final String FALSE_TRUE_TRUE = "Результат: качественно и не дорого, но ооочень медленно";
    public static final String TRUE_TRUE_FALSE = "Результат: быстро, качественно, а ка ты хотел придется платить";
    public static final String INVALID_ARGS = "Должно быть минимум 2 true";
    private static ByteArrayOutputStream outStreamBuffer;
    private static PrintStream defaultStdOut;

    static {
        defaultStdOut = System.out;
        outStreamBuffer = new ByteArrayOutputStream();
    }

    public static void main(String[] args) {
        changeStdOutToByteArrayStream();
        checkResultOfWork(true,false,true);
        checkResult(TRUE_FALSE_TRUE);

        changeStdOutToByteArrayStream();
        checkResultOfWork(true,true,true);
        checkResult(TRUE_TRUE_TRUE);

        changeStdOutToByteArrayStream();
        checkResultOfWork(false,true,true);
        checkResult(FALSE_TRUE_TRUE);

        changeStdOutToByteArrayStream();
        checkResultOfWork(true,true,false);
        checkResult(TRUE_TRUE_FALSE);

        changeStdOutToByteArrayStream();
        checkResultOfWork(false,true,false);
        checkResult(INVALID_ARGS);

        changeStdOutToByteArrayStream();
        checkResultOfWork(false,false,false);
        checkResult(INVALID_ARGS);
    }

    private static void checkResult(String inputString) {
        String string = outStreamBuffer.toString();
        String msg = string.equals(inputString) ? "Умничка: " + string : "Не умничка должно быть: " + inputString;
        outStreamBuffer.reset();
        System.out.close();
        System.setOut(defaultStdOut);
        System.out.println(msg);
    }

    private static void changeStdOutToByteArrayStream() {
        System.setOut(new PrintStream(outStreamBuffer));
    }

    public static void checkResultOfWork(boolean quick, boolean efficient, boolean reliable) {
        String res = quick + "_" + efficient + "_" + reliable;
        switch (res.toUpperCase()) {
            case "TRUE_TRUE_TRUE" -> System.out.print(TRUE_TRUE_TRUE);
            case "TRUE_FALSE_TRUE" -> System.out.print(TRUE_FALSE_TRUE);
            case "FALSE_TRUE_TRUE" -> System.out.print(FALSE_TRUE_TRUE);
            case "TRUE_TRUE_FALSE" -> System.out.print(TRUE_TRUE_FALSE);
            default -> System.out.print(INVALID_ARGS);
        }
    }
}


//        if (quick && !efficient && reliable) {
//            System.out.print(TRUE_FALSE_TRUE);
//        } else if (quick && efficient && reliable) {
//            System.out.print(TRUE_TRUE_TRUE);
//        } else if (!quick && efficient && reliable) {
//            System.out.print(FALSE_TRUE_TRUE);
//        } else if (quick && efficient && !reliable) {
//            System.out.print(TRUE_TRUE_FALSE);
//        } else {
//            System.out.print(INVALID_ARGS);
//        }
