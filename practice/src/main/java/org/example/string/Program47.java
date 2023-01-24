package org.example.string;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* read a string and reverse even length words
* */
public class Program47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string ");
        String s1 = scanner.nextLine();
        StringTokenizer stringTokenizer =new StringTokenizer(s1," ");
        StringBuilder stringBuilder = new StringBuilder();
        while (stringTokenizer.hasMoreTokens()){
            String word = stringTokenizer.nextToken();
            if(word.length()%2==0){
                stringBuilder.append(new StringBuilder(word).reverse());
            }else{
                stringBuilder.append(word);
            }
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);
    }
}
