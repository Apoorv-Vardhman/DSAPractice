package org.example.basic;

import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
//02. sum of 'n' natural numbers
public class Program2 {

    public static void main(String[] args) {
        System.out.print("Enter natural number ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(naturalNumberSum(num));
    }

    private static int naturalNumberSum(int num){
        return (num*(num+1))/2;
    }
}
