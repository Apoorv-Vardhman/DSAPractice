package org.example.string;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* read a string separated by , and fetch data one by one
* */
public class Program43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string ");
        String s = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(s,",");
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
