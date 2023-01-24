package org.example.array.update;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* updating the given element with new element first occurrence.
* */
public class Program30 {
    static void updateElementFirst(int[] array, int element, int replaceElement){
        for (int i=0;i<array.length;i++){
            if(array[i]==element){
                array[i] = replaceElement;
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {10, 11, 12, 11, 14, 11, 16, 11};
        System.out.println(Arrays.toString(a));//[10, 11, 12, 11, 14, 11, 16, 11]
        updateElementFirst(a,11,888);
        System.out.println(Arrays.toString(a));//[10, 888, 12, 11, 14, 11, 16, 11]
        changeNo(a);
        System.out.println(Arrays.toString(a));
    }

    static void changeNo(int[] a){
        a[0] = 50;
    }
}
