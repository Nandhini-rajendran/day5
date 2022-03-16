package com.dxc.day4;
import java.util.*;
public class VowelsConsonent
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        String str=ip.nextLine();
        String str1=str.toLowerCase();
        int Vcount=0;
        int Ccount=0;
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
            {
                Vcount++;
            }
            else if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
            {
                Ccount++;
            }
        }
        System.out.println(Vcount);
        System.out.println(Ccount);
    }
}



