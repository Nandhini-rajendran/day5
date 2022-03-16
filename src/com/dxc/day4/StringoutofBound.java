package com.dxc.day4;

public class StringoutofBound
{
    public static void main(String[] args)
    {
        try {
            String str = "i love java very much";
            System.out.println(str.charAt(90));
        }
        catch(StringIndexOutOfBoundsException str)
        {

            System.out.println("str");
        }
    }
}
