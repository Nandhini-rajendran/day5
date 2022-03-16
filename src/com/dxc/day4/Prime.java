package com.dxc.day4;
import java.util.*;
//// write a program to sort an array elements and print all the prime numbers are in the array.
public class Prime {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ip.nextInt();
        }
        // Arrays.sort(a);
        for (int i = n-1 ; i>=0; i--) {
            System.out.print(a[i] + " ");

        }


    }
}





