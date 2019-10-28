package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {

        if (jumpHeight > flagHeight) {
            return flagHeight;
        }

        Integer jump1 = flagHeight / jumpHeight;

        Integer jump2 = flagHeight % (jump1 * jumpHeight);

        Integer jumpTotal = jump1 + jump2;

        return jumpTotal;
    }
}
