package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] arr = {-2,2, 3, 8,2};
        System.out.println(Arrays.toString(task1(arr)));
    }

    public static int[] task1(int[] array) {
        int tmF;
        int tmS;
        int dif = 1;
        for (int i = 0; i <array.length/2 ; i++) {
            if(array[i]%2==0 && array[array.length-dif]%2==0 ) {
                tmF = array[i];
                tmS = array[array.length - dif];
                array[i] = tmS;
                array[array.length - dif] = tmF;
                dif++;
            }
        }
        return array;
    }

}

