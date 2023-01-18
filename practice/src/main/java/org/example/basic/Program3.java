package org.example.basic;

import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/* 03. factorial of the given number
    Ex:
            ---
            5! = 5x4x3x2x1x0! = 5x4x3x2x1x1 = 120
            0! = 1
            2! = 2x1x0! = 2x1x1 = 2 */
public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num ");
        int num = scanner.nextInt();
        System.out.println(fact(num));

    }
    private static int fact(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }

}
