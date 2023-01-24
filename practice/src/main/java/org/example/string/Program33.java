package org.example.string;


import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* Print char and corresponding index value?
* */
public class Program33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string ");
        String s = scanner.nextLine();
        for (int i=0;i<s.length();i++){
            System.out.println(i+"==>"+s.charAt(i));
        }
    }

}
