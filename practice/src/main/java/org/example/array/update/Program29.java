package org.example.array.update;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* updating an element present at given location.
* */
public class Program29 {
    static int[] updateAtLoc(int[] array,int position,int element){
        for(int i=0;i<array.length;i++){
            if(i==position){
                array[i] = element;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {44, 66, 77, 33,77,77 };
        System.out.println("Before update "+ Arrays.toString(array));
        System.out.println("After update "+ Arrays.toString(updateAtLoc(array,2,30)));
    }
}
