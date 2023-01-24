package org.example.array.update;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* updating the given element with new element in all occurrences
* */
public class Program32 {
    static void updateArray(int[] a,int element,int replaceElement){
        for(int i=0;i<a.length;i++){
            if(a[i]==element){
                a[i] = replaceElement;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 11, 12, 11, 14, 11, 16, 11};
        System.out.println(Arrays.toString(a));
        updateArray(a,11,300);
        System.out.println(Arrays.toString(a));
    }
}
