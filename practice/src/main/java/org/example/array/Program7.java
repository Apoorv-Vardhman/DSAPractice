package org.example.array;

import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* 7) sum of elements which are ending with 3 in an array--> if(item%10==3)
* */
public class Program7 {
    public static void main(String[] args) {
        System.out.print("Enter size ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter "+(i+1)+" element ");
            array[i] = scanner.nextInt();
        }
        int sum =0;
        for(var a: array){
            if(a%10==3){
                sum+=a;
            }
        }
        System.out.printf("sum "+sum);
    }
}
