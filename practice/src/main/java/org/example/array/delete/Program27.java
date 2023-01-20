package org.example.array.delete;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* deleting specified element from an array first and second occurrence
* */
public class Program27 {

    static int[] deleteFirstSecondOcc(int[] array,int element){
        int totalOcc = 0;
        for(int a:array){
            if(a==element){
                if(totalOcc<=1){
                    ++totalOcc;
                }else{
                    break;
                }
            }
        }
        int[] newArray = new int[array.length-totalOcc];
        int totalRemove = 0;
        int i=0;
        for(int a:array){
            if(a!=element){
                newArray[i] = a;
                i++;
            }else{
                if(totalRemove==totalOcc){
                    newArray[i] = a;
                    i++;
                }else{
                    ++totalRemove;
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] a = {10, 11, 12, 11, 14, 11, 16, 11};
        System.out.println("Before remove "+ Arrays.toString(a));
        System.out.println("After remove "+Arrays.toString(deleteFirstSecondOcc(a,11)));
    }
}
