package org.example.basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* IMPLEMENT A ALGO/PROGRAM TO GENERATE FIBNOCCI NUMBERS
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
0 1 1 2 3 5 8 13 ......

FIB Seq ---> every number is sum of previous two numbers
* */
public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = scanner.nextInt();
        for(var a:getFab(num)){
            System.out.println(a);
        }
    }

    static ArrayList<Integer> getFab(int num){
        int start=0,last=1;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(start);
        numbers.add(last);
        for(int i=1;i<=num-2;i++){
            int sum = start+last;
            numbers.add(sum);
            start = last;
            last = sum;
        }
        return numbers;
    }
}
