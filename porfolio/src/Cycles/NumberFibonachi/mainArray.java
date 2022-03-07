package Cycles.NumberFibonachi;

import java.util.Arrays;

public class mainArray {
    public static void main(String[] args) {
        int[] array = new int[12];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < 12; i++) {
            array[i] = array[i-1]+array[i-2];

        }
        System.out.println(Arrays.toString(array));
    }
}
