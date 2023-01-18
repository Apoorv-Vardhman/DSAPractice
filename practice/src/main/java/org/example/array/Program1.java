package org.example.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* 1) Reading and Writing Array Elements
* */
public class Program1 {
    public static void main(String[] args) {
        System.out.println("Enter size of array ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter "+(i+1)+" element ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
