package org.example.array.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* 12) sorting array elements:-
    ~~~~~~~~~~~~~~~~~~~~~~~
    [3, 1, 5, 2, 4] sort in asc order ----> [1, 2, 3, 4, 5]
    [3, 1, 5, 2, 4] sort in desc order ---> [5, 4, 3, 2, 1]
    sorting array in asc order ----> predefined ---> Arrays.sort(a);
* */
public class Program12 {
    public static void main(String[] args) {
        System.out.print("Enter size ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter "+(i+1)+" element ");
            array[i] = scanner.nextInt();
        }
        ascendingSort(array);
        descendingSort(array);
        System.out.println("After sort ");
        Arrays.sort(array);
        //Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }

    static void descendingSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]<array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("After sort "+Arrays.toString(array));
    }

    static void ascendingSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("after sort "+ Arrays.toString(array));
    }


}
