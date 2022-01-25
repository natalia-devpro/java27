package lesson6;

import java.util.Locale;

public class StringUtils {


    /**
     * 1 - модификатор доступа (одно из 4х видов слов,
     * которое регулирует область видимости данного метода)
     * public - доступен внутри всего проекта
     * ______ - доступен внутри текущего пакета
     * protected - доступен внутри пакета и класса наследникам
     * private - доступ внутри текущего класса
     * 2 - static (или пишем, или нет).
     * 3 - возвращаемый тип (int, String, Date, ...) или void если ничего не возвращается
     * 4 - название метода
     * 5 - входящие параметры (String text, int count) ...
     * 6 - тело метода, то что будет происходить, при вызове данного метода
     */

    public static int countGlassFromText(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'o'
                    || text.charAt(i) == 'i' || text.charAt(i) == 'e'
                    || text.charAt(i) == 'y' || text.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void reverseCharInWords(String text) {
        int lengthText = text.length() - 1;
        String reverse = "", temp = "";
        for (int i = 0; i <= lengthText; i++) {
            temp += text.charAt(i);
            if ((text.charAt(i) == ' ') || (i == lengthText)) {
                for (int j = temp.length() - 1; j >= 0; j--) {
                    reverse += temp.charAt(j);
                    if ((j == 0) && (i != lengthText))
                        reverse += " ";
                }
                temp = "";
            }
        }
        System.out.println(reverse);
    }

    public static void coding(String textByCoding) {
        // textByCoding = qwertyui98y --
        String alfabet = "abcdefghijklmnopqrstuvwxyza";
        String alfabetUpper = alfabet.toUpperCase();
        String result = "";
        for (int i = 0; i < textByCoding.length(); i++) {
            int index = alfabet.indexOf(textByCoding.charAt(i));
            int indexUpper = alfabetUpper.indexOf(textByCoding.charAt(i));
            if (index >= 0) {
                result = result + alfabet.charAt(index + 1);
            } else if (indexUpper >= 0) {
                result = result + alfabetUpper.charAt(indexUpper + 1);
            } else {
                result = result + textByCoding.charAt(i);
            }
        }
        System.out.println(result);
    }

}
