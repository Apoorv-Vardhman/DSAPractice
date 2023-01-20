package org.example.array.delete;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* deleting an element from given location
* */
public class Program24 {
    static int[] deleteLoc(int[] array,int location){
        int[] newArray = new int[array.length-1];
        for(int i=0;i<location;i++){
            newArray[i] = array[i];
        }

        for(int i=location+1;i<array.length;i++){
            newArray[i-1] = array[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] array = {44, 66, 77, 33 };
        System.out.println("Before delete "+ Arrays.toString(array));
        System.out.println("After delete "+Arrays.toString(deleteLoc(array,2)));
    }
}
