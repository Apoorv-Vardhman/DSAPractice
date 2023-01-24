package org.example.string;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* count number of vowels in string
* */
public class Program38 {
    public static void main(String[] args) {
        String s = "welcome";
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println(c);
                count++;
            }
        }
        System.out.println("total vowels "+count);
    }
}
