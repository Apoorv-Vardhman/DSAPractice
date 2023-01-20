package org.example.array.insert;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* inserting an element in to the last location
* */
public class Program20 {
    static int[] insertLast(int[] arr, int ele){
        int[] array = new int[arr.length+1];
        for (int i =0;i<arr.length;i++){
            array[i] = arr[i];
        }
        array[arr.length] = ele;
        return array;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println("Before insert "+ Arrays.toString(array));
        System.out.println("After insert "+Arrays.toString(insertLast(array,10)));
    }
}
