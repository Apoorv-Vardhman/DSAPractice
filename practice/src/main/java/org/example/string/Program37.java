package org.example.string;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* print consonants present in the given string
* */
public class Program37 {
    public static void main(String[] args) {
        String s = new String("welcome");
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')){
                System.out.println(c);
            }
        }
    }
}
