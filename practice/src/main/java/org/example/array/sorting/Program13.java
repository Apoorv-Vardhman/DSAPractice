package org.example.array.sorting;

import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* 13) sort the array asc ---> a ---> 1stsmall, 2nd small, 3rd small, .....2nd max, 1st max

    1st max ------> a[n-1]         1st min -------> a[1-1]
    2nd max ------> a[n-2]         2nd min -------> a[2-1]
    3rd max ------> a[n-3]         3rd min -------> a[3-1]

    kth max ------> a[n-k]         kth min -------> a[k-1]
*
* */
public class Program13 {
    public static void main(String[] args) {
        System.out.print("Enter size ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter "+(i+1)+" element ");
            array[i] = scanner.nextInt();
        }
        int[] sorted = ascending(array);
        System.out.println("1st max "+sorted[array.length-1]);
        System.out.println("2nd max "+sorted[array.length-2]);
        System.out.println("3rd max "+sorted[array.length-3]);

        System.out.println("1st min "+sorted[0]);
        System.out.println("2nd min "+sorted[1]);
        System.out.println("3rd min "+sorted[2]);

    }

    static int[] ascending(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
