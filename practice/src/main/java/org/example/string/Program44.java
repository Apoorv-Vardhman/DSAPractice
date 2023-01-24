package org.example.string;

import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* read a sentence and reverse the total given sentence
* */
public class Program44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string ");
        String s = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(stringBuilder.reverse());
    }
}
