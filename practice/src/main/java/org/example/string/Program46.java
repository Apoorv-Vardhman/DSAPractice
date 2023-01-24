package org.example.string;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* read a string and reverse alternative words
* */
public class Program46 {
    public static void main(String[] args) {
        System.out.println("Enter string ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(s," ");
        StringBuilder stringBuilder = new StringBuilder();
        while (stringTokenizer.hasMoreTokens()){
            String s1 = stringTokenizer.nextToken();
            if(count%2==0){
                stringBuilder.append(s1);
            }else{
                stringBuilder.append(new StringBuilder(s1).reverse());
            }
            stringBuilder.append(" ");
            count++;
        }
        System.out.println(stringBuilder);
    }
}
