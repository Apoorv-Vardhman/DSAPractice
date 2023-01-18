package org.example.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* 04. swaping of two integer values
* Ex:
---
	a=10,b=20 -----> a=20,b=10
	* Algorithm:
----------
			1. read 'a' and 'b' values from the user.
			2. before swaping print the values of 'a' and 'b'
			3. apply business logic
			logic1: by using temp variable
			-------------------------------
			temp=a;
			a=b;
			b=temp;

			logic2: by using addition and sub
			---------------------------------
			a=a+b;
			b=a-b;
			a=a-b;

			logic3: by using mul and div
			----------------------------
			a=a*b;
			b=a/b;
			a=a/b;

			logic4: by using bitwise operators
			----------------------------------
			a=a^b
			b=a^b
			a=a^b

			logic5: by using single line statement
			---------------------------------------
			a=a+b-b=a;

			4. after swaping print the values of 'a' and 'b'
* */
public class Program4 {
    public static void main(String[] args) {
        System.out.println("Enter num1 ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter num2 ");
        int num2 = scanner.nextInt();
        //swapNumber(num1,num2);
        swapNum(num1,num2);
    }

    /*
    * Arbitrary Number of Arguments
    * https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html#varargs
    * */
    public static void swapNumber(int... numbers){
        if(numbers.length==2){
            int temp = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = temp;
            System.out.println(Arrays.toString(numbers));
        }
    }

    public static void swapNum(int num1,int num2){
        num1 = num2+num1;
        num2 = num1 - num2;
        num1 = num1-num2;
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }

    public static void swapNumberMultiply(int num1,int num2){

    }
}
