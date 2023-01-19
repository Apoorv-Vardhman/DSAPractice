package org.example.basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
*IMPLEMENT A ALGO/PROGRAM TO GENERATE TRIBONCCI NUMBERS
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
0 1 2 ----> 0 1 2 3 6 11 20 ....

ALGO:
-----
		1. read 'n' value from the user.
		2. create an array with size n.
		3. push all the calcualted trib seq values into an array.

		logic:
		------
				a=0;
				b=1;
				c=2;
				arr[0] = a;
				arr[1] = b;
				arr[2] = c;
				for(i=3;i<n;i++)
				{
					d=a+b+c;
					arr[i]=d;
					a=b;
					b=c;
					c=d;
				}

		4. print the result array
* */
public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num ");
        int num = sc.nextInt();
        for(var a:getFab(num)){
            System.out.println(a);
        }
    }

    static ArrayList<Integer> getFab(int num){
        ArrayList<Integer> numbers = new ArrayList<>();
        int start = 0,second = 1,end = 1;
        numbers.add(start);
        numbers.add(second);
        numbers.add(end);
        for(int i=3;i<=num;i++){
            int sum = start+second+end;
            numbers.add(sum);
            start = second;
            second = end;
            end = sum;
        }
        return numbers;
    }
}
