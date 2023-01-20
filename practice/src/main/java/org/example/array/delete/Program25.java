package org.example.array.delete;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* deleting all elements from an array
* */
public class Program25 {
    static int[] deleteAll(){
        return new int[0];
    }

    public static void main(String[] args) {
        int[] array = {44, 66, 77, 33 };
        System.out.println("Before delete "+ Arrays.toString(array));
        array = deleteAll();
        System.out.println("After delete all "+Arrays.toString(array));
    }
}
