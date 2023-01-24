package org.example.string;

import java.util.StringTokenizer;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Test {
    public static void main(String[] args) {
        String  s = "java was very easy programming language when compared with other";
        String[] strings= s.split(" ");
        for (var a:strings){
            System.out.println(a);
        }

        StringTokenizer stringTokenizer = new StringTokenizer(s);
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
