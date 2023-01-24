package org.example.string;

import java.util.StringTokenizer;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class StringTokenizerExample {
    public static void main(String[] args) {
        String s = "My name is Apoorv";
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        while (stringTokenizer.hasMoreTokens()){
            // default delimiter " \t\n\r\f":
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
