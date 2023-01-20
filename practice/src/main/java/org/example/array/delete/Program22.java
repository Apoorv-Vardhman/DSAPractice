package org.example.array.delete;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* deleting an element from first location
* */
public class Program22 {
    static int[] deleteFirst(int[] array){
        int[] newArray = new int[array.length-1];
        for(int i=0;i<array.length-1;i++){
            newArray[i] = array[i+1];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] array = {44, 66, 77, 33 };
        System.out.println("Before delete "+ Arrays.toString(array));
        System.out.println("After delete "+Arrays.toString(deleteFirst(array)));
    }
}
