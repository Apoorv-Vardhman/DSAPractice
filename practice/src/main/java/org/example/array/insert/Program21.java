package org.example.array.insert;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* 21) case3: inserting an element in to specified location
* 44, 66, 77, 33
* */
public class Program21 {
    static int[] insertLocation(int[] array,int element, int location){
        int[] newArray = new int[array.length+1];
        for(int i=0;i<location;i++){
            newArray[i] = array[i];
        }
        newArray[location] = element;
        for(int i=location;i<array.length;i++){
            newArray[i+1] = array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {44, 66, 77, 33 };
        System.out.println("Before insert "+ Arrays.toString(array));
        System.out.println("After insert "+Arrays.toString(insertLocation(array,50,2)));
    }
}
