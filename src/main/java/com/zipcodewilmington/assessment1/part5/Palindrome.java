package com.zipcodewilmington.assessment1.part5;


import java.util.ArrayList;

public class Palindrome {

    public Integer countPalindromes(String input){
        ArrayList<String> stringList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                stringList.add(input.substring(i, j));
            }
        }

        System.out.println(stringList);

        return 0;
    }
}
