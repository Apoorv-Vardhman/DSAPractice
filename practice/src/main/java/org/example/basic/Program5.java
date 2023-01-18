package org.example.basic;

import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* 05. prime number or not
* a number is said to be prime, if it is divisible by one and itself. i.e. factors is equal to 2.
* */
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = scanner.nextInt();
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int n, int i)
    {
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, i + 1);
    }

    private static boolean isPrime(int num){
        int fact = 0;
        if(num<2){
            return false;
        }else if(num==2){
            return true;
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    fact++;
                    break;
                }
            }
            return fact == 0;
        }
    }
}
