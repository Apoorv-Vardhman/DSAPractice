package org.example.string;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* Print char and corresponding index value which are present at odd indexed loc?
* */
public class Program35 {

    public static void main(String[] args) {
        String s = "welcome";
        for (int i=0;i<s.length();i++){
            if(i%2!=0){
                System.out.println(s.charAt(i));
            }
        }
    }
}
