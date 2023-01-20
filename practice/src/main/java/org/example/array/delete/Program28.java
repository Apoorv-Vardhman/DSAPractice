package org.example.array.delete;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* deleting specified element from an array in all occurrences
* */
public class Program28 {
    static int[] deleteAtLocation(int[] array,int position){
        int[] newArray = new int[array.length-1];
        int k=0;
        for(int i=0;i<array.length;i++){
            if(i!=position){
                newArray[k] = array[i];
                k++;
            }
        }
        return newArray;
    }

    static int[] deleteAllOcc(int[] array,int element){
        for(int i=0;i<array.length;i++){
            if(array[i]==element){
                array = deleteAtLocation(array,i);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = {10, 11, 12, 11, 14, 11, 16, 11};
        System.out.println(Arrays.toString(a));//[10, 11, 12, 11, 14, 11, 16, 11]
        a=deleteAllOcc(a,11);
        System.out.println(Arrays.toString(a));//[10, 12, 14, 16]
    }
}
