package com.dxc.day4;

public class Arth2
{
    public static void main(String args[])
    {
        try {
            int a = 50 / 0;
        }
        catch(ArithmeticException a)
        {
            System.out.println(a);
        }
        finally
        {
            System.out.println("always run");
        }
    }
}
