import java.util.InputMismatchException;
public class Translation {
public static String convertNumToRoman(int numArabian) {
    String[] roman = {"throws Exception //т.к. в римской системе нет нуля", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    final String s = roman[numArabian];
    return s;
}

    public static int romanToNumber(String roman) {
        try {
            if (roman.equals("I")) {
                return 1;
            } else if (roman.equals("II")) {
                return 2;
            } else if (roman.equals("III")) {
                return 3;
            } else if (roman.equals("IV")) {
                return 4;
            } else if (roman.equals("V")) {
                return 5;
            } else if (roman.equals("VI")) {
                return 6;
            } else if (roman.equals("VII")) {
                return 7;
            } else if (roman.equals("VIII")) {
                return 8;
            } else if (roman.equals("IX")) {
                return 9;
            } else if (roman.equals("X")) {
                return 10;
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Неверный формат данных");
        }
        return -1;

    }
}
