package org.example.array.equality;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* equality of arrays by checking manually
* */
public class Program15 {
    static boolean isEqual(int[] a,int[] b){
        if(a.length==b.length){
            for (int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] w = {1, 2, 3};
        int[] x = {4, 5, 6};
        int[] y = {1, 2, 3};
        int[] z = {1, 3, 2};

        System.out.println("w==>"+Arrays.toString(w));
        System.out.println("x==>"+ Arrays.toString(x));
        System.out.println("y==>"+Arrays.toString(y));
        System.out.println("z==>"+Arrays.toString(z));

        System.out.println("w==x==>"+ isEqual(w,x));
        System.out.println("x==y==>"+isEqual(x,y));
        System.out.println("w==y==>"+isEqual(w,y));
        System.out.println("w==z==>"+isEqual(w,z));
    }
}
