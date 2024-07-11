package net.foxi;

public class Conditions {
    public static boolean passwordLen(String str, int p_lenMin) {
        return str.length() >= p_lenMin;
    }

    public static boolean strC(String str, int p_strMin) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                num++;
            }
            if (num >= p_strMin) {
                return true;
            }
        }

        return false;
    }

    public static boolean digitsC(String str, int p_numMin) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num++;
            }
            if (num >= p_numMin) {
                return true;
            }
        }

        return false;
    }

    public static boolean specSym(String str, int p_specSymMin) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == '$') || (str.charAt(i) == '#')) {
                num++;
            }
            if (num >= p_specSymMin) {
                return true;
            }
        }

        return false;
    }
}