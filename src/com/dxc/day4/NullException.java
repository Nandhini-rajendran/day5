package com.dxc.day4;

public class NullException
{
    public static void main(String[] args)
    {
        try {
            String str = null;
            String s = str.concat("excption");
        }
        catch(NullPointerException s) {
            System.out.println(s);
        }
    }
}
