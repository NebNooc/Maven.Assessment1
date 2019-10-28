package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer total = 0;

        for (int i = 0; i < intArray.length; i++){
            total += intArray[i];
        }

        return total;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer total = 1;

        for (int i = 0; i < intArray.length; i++){
            total *= intArray[i];
        }

        return total;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Integer total = getSum(intArray);
        Double total2 = Double.valueOf(total);
        return total2 / intArray.length;
    }
}
