package org.example.array;

import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* 8) sum of elements which are divisible by 3 in an array-> if(item%3==0)
* */
public class Program8 {
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
            if(a%3==0){
                sum+=a;
            }
        }
        System.out.printf("sum "+sum);
    }
}
