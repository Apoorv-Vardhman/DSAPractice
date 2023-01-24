package org.example.string;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* sort all characters present in the given string in desc order?
* */
public class Program41 {
    public static void main(String[] args) {
        String s = "welcome";
        char[] chars = s.toCharArray();
        desc(chars);
        System.out.println(chars);
    }

    static void desc(char[] chars){
        for(int i=0;i<chars.length;i++){
            for(int k=i+1;k< chars.length;k++){
                if(chars[i]<chars[k]){
                    char temp = chars[i];
                    chars[i] = chars[k];
                    chars[k] = temp;
                }
            }
        }
    }
}
