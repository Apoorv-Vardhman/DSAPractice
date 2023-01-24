package org.example.string;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* read a string and convert every word first and last char into caps
* java was very easy programming language when compared with other
* */
public class Program50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string ");
        String s = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(s," ");
        while (stringTokenizer.hasMoreTokens()){
            String word = stringTokenizer.nextToken();
            stringBuilder.append(word.substring(0,1).toUpperCase());
            stringBuilder.append(word.substring(1,word.length()-1));
            stringBuilder.append(word.substring(word.length()-1).toUpperCase());
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);
    }
}
