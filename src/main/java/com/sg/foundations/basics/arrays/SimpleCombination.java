/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SimpleCombination {

    public static int[] mergeArrays2(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

        Set<Integer> nodupes = new HashSet<Integer>();

        for (int i = 0; i < merged.length; i++) {
            nodupes.add(merged[i]);
        }

        int[] nodupesarray = new int[nodupes.size()];
        int i = 0;
        Iterator<Integer> it = nodupes.iterator();
        while (it.hasNext()) {
            nodupesarray[i] = it.next();
            i++;
        }

        return nodupesarray;
    }

    public static int[] zip(int[] array1, int[] array2) {
//make sure both arrays have same length
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Unequal array lengths - zip not possible");
        }

        int[] zippedArray = new int[array1.length + array2.length];
        int idx_1 = 0;
        int idx_2 = 0;

//for each element of first array, add to new array if index of new array is even
        for (int i = 0; i < zippedArray.length; i += 2) {
            zippedArray[i] = array1[idx_1++];
        }
        for (int i = 1; i < zippedArray.length; i += 2) {
            zippedArray[i] = array2[idx_2++];
        }


        return zippedArray;

    }

    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!

        int[] wholeNumbers = new int[24];

//       wholeNumbers = mergeArrays2(firstHalf,secondHalf);
//       for(int i = 0;i <wholeNumbers.length;i++){
//           System.out.println( (i+1) + "."+wholeNumbers[i] + " ");
//       }
        wholeNumbers = zip(firstHalf, secondHalf);
        for (int i = 0; i < wholeNumbers.length; i++) {
            System.out.println((i + 1) + "." + wholeNumbers[i] + " ");
        }

    }
}
