package org.example.array.basic;

import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* 9) sum of prime elements in an array--------------------> if(isprime(item))
* */
public class Program9 {
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
            if(isPrime(a)){
                sum+=a;
            }
        }
        System.out.printf("sum "+sum);
    }

    static boolean isPrime(int num){
        if(num<=2){
            return num==2;
        }else{
            boolean check = true;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    check = false;
                    break;
                }
            }
            return check;
        }
    }


}
