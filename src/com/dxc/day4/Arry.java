package com.dxc.day4;
import java.util.*;

public class Arry
{
    public static void main(String args[])
    {
        Scanner ip=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=ip.nextInt();
        }
        try {
            a[10] = 5;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            for (int i = 0; i < 5; i++) {
                System.out.println(a[i]);
            }
        }

    }
}
