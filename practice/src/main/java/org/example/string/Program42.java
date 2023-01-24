package org.example.string;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* check whether two strings are anagrams or not?
* */
public class Program42 {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        System.out.println(isAnagram(s1.toCharArray(),s2.toCharArray()));
    }

    static boolean isAnagram(char[] ch1,char[] ch2){
        if(ch1.length!=ch2.length){
            return false;
        }
        asc(ch1);
        asc(ch2);
        for(int i=0;i<ch1.length;i++){
            if(ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }

    static void asc(char[] chars){
        for(int i=0;i<chars.length;i++){
            for(int j=i+1;j<chars.length;j++){
                if(chars[i]>chars[j]){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
    }
}
