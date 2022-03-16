package com.dxc.day4;

public class Numberformat
{
    public static void main(String[] args)
    {
        try {
            int num = Integer.parseInt("akki");
            System.out.println(num);
        }
        catch(NumberFormatException e)
        {
            System.out.println("it is not a number");
        }
    }
}
