package org.example.array.insert;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* inserting an element in to the first location
* */
public class Program19 {
    static int[] insertFirst(int[] array,int element){
        int[] a = new int[array.length+1];
        a[0] = element;
        for(int i=0;i<array.length;i++){
            a[i+1] = array[i];
        }
        // System.arraycopy(array, 0, a, 1, array.length);
        return a;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println("Before insert "+ Arrays.toString(array));
        System.out.println("After insert "+Arrays.toString(insertFirst(array,10)));
    }
}
