package org.example.string;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* read a string and except first and last char remaining into upper case
* java was very easy programming language when compared with other
  jAVa wAs vERy eASy pROGRAMMINg lANGUAGe wHEn cOMPAREd wITh oTHEr
* */
public class Program51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string ");
        String s = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        while (stringTokenizer.hasMoreTokens()){
            String word = stringTokenizer.nextToken();
            stringBuilder.append(word.charAt(0));
            stringBuilder.append(word.substring(1, word.length() - 1).toUpperCase());
            stringBuilder.append(word.charAt(word.length()-1));
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);
    }
}
