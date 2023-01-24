package org.example.string;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* read a string and reverse and individual words
* */
public class Program45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string ");
        String s = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        while (stringTokenizer.hasMoreTokens()){
            StringBuilder sb = new StringBuilder(stringTokenizer.nextToken());
            System.out.println(sb.reverse());
        }
    }
}
