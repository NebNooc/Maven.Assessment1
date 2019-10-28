package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToCount) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Integer occurences = getNumberOfOccurrences(objectArray, objectToRemove);
        System.out.println(occurences);
        Integer[] arr = new Integer[objectArray.length - occurences];
        Integer counter = 0;
        

        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] != objectToRemove) {
                arr[counter] =  (Integer) objectArray[i];
                counter++;
            }
        }
        System.out.println(Arrays.toString(arr));

        return arr;


    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int counter = 1, tempCount;
        int popular = (Integer) objectArray[0];
        int temp = 0;
        for (int i = 0; i < (objectArray.length - 1); i++)
        {
            temp = (Integer) objectArray[i];
            tempCount = 0;
            for (int j = 1; j < objectArray.length; j++)
            {
                if (temp == (Integer) objectArray[j])
                    tempCount++;
            }
            if (tempCount > counter)
            {
                popular = temp;
                counter = tempCount;
            }
        }
        return popular;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer[] objectResult = new Integer[objectArray.length + objectArrayToAdd.length];
        Integer counter = 0;
        System.out.println(objectResult.length);
        System.out.println(objectArray.length);
        System.out.println(objectArrayToAdd.length);

        for (int i = 0; i < objectResult.length; i++) {
            if (i < objectArray.length) {
                objectResult[i] = (Integer) objectArray[i];
            } else {
                objectResult[i] = (Integer) objectArrayToAdd[counter];
                counter++;
            }
        }

        return objectResult;
    }
}
