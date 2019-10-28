package com.zipcodewilmington.assessment1.part1;


/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {

    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        Character firstLetter = Character.toUpperCase(str.charAt(0));
        str = str.substring(1);
        str = firstLetter + str;
        return str;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String[] array = str.split("");
        StringBuilder reverse = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(array[i]);
        }
        return reverse.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        Integer length = str.length() - 1;

        return str.substring(1, length);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] strArray = str.toCharArray();

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] >= 'a' && strArray[i] <= 'z') {
                strArray[i] -= 32;
            } else if (strArray[i] >= 'A' && strArray[i] <= 'Z'){
                strArray[i] += 32;
            }
        }

        String str2 = new String(strArray);
        return str2;
    }
}
