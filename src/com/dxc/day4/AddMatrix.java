package com.dxc.day4;
import java.util.*;
class sum {
    public static int[] sumArray(int arr1[], int arr2[]) {
        int c[] = new int[5];
        for(int i=0;i<5;i++)
        {
            c[i]=arr1[i]+arr2[i];
        }

        return c;
    }
}
public class AddMatrix
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr1[i]=ip.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            arr2[i]=ip.nextInt();
        }
        int c[]=new int[5];
        sum sb=new sum();
        c=sb.sumArray(arr1,arr2);
        for(int i=0;i<5;i++)
        {
            System.out.print(c[i]+" ");
        }

    }
}
