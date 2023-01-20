package org.example.array.equality;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* Equality by using predefined methods
*
* */
public class Program17 {
    public static void main(String[] args) {
        int[] w = {1, 2, 3};
        int[] x = {4, 5, 6};
        int[] y = {1, 2, 3};
        int[] z = {1, 3, 2};

        System.out.println("w==>"+ Arrays.toString(w));
        System.out.println("x==>"+ Arrays.toString(x));
        System.out.println("y==>"+Arrays.toString(y));
        System.out.println("z==>"+Arrays.toString(z));

        System.out.println("w==x==>"+ Arrays.equals(w,x));
        System.out.println("x==y==>"+Arrays.equals(x,y));
        System.out.println("w==y==>"+Arrays.equals(w,y));
        System.out.println("w==z==>"+Arrays.equals(w,z));
    }
}
