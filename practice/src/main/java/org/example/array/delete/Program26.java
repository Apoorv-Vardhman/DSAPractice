package org.example.array.delete;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* deleting specified element from an array
* */
public class Program26 {

    static int[] deleteElement(int[] array,int element){
        int[] newArray = new int[array.length-1];
        int k=0;
        boolean isDeleted = false;
        for(var a :array){
            if(a!=element || isDeleted){
                newArray[k] = a;
                k++;
            }else{
                isDeleted = true;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {44, 66, 77, 33,77,77 };
        System.out.println("Before delete "+ Arrays.toString(array));
        System.out.println("After delete element "+Arrays.toString(deleteElement(array,77)));
    }
}
