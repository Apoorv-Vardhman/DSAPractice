package org.example.array.update;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* updating the given element with new element first and second occurrence.
* */
public class Program31 {
    static void updateArray(int[] a,int element,int replaceElement){
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==element){
                if(count<2){
                    a[i] = replaceElement;
                    count++;
                }else{
                    break;
                }
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
