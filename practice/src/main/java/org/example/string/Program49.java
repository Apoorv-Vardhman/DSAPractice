package org.example.string;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* read a string and convert every word first char into caps
* */
public class Program49 {
    public static void main(String[] args) {
        System.out.println("Enter any string ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(s," ");
        while (stringTokenizer.hasMoreTokens()){
            String s1 = stringTokenizer.nextToken();
            stringBuilder.append(s1.substring(0, 1).toUpperCase()).append(s1.substring(1));
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);

    }
}
