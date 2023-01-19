package org.example.basic;

import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* 06. max of three numbers
* */
public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number ");
        int num3 = scanner.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1);
        }else if(num2>num1 && num2>num3){
            System.out.println(num2);
        }else{
            System.out.println(num3);
        }
    }
}
