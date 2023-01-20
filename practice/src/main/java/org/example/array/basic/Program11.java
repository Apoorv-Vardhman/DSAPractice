package org.example.array.basic;

import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* 11) min element in an array
* */
public class Program11 {
    public static void main(String[] args) {
        System.out.print("Enter size ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter "+(i+1)+" element ");
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int j : array) {
            if (max > j) {
                max = j;
            }
        }
        System.out.printf("min "+max);
    }
}
