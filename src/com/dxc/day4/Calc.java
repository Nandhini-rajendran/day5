package com.dxc.day4;
import java.util.*;
class calculator
{
    public void add(int n1,int n2)
    {
        System.out.println(n1+n2);
    }
    public void sub(int n1,int n2)
    {
        System.out.println(n1-n2);
    }
    public void multiply(int n1,int n2)
    {
        System.out.println(n1*n2);
    }
    public void dicide(int n1,int n2)
    {
        System.out.println(n1/n2);
    }
}
public class Calc {
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        calculator c = new calculator();
        while (true) {
            System.out.println("enter ur choice : ");
            System.out.println("enter 1 for add :");
            System.out.println("enter 2 for sub :");
            System.out.println("enter 3 for mulitply : ");
            System.out.println("enter 4 for divide :");
            int choice = ip.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter first number :");
                    int n1 = ip.nextInt();
                    System.out.println("enter second number :");
                    int n2 = ip.nextInt();
                    c.add(n1, n2);
                    break;
                }
                case 2: {
                    System.out.println("Enter first number :");
                    int n1 = ip.nextInt();
                    System.out.println("enter second number :");
                    int n2 = ip.nextInt();
                    c.sub(n1, n2);
                    break;
                }
                case 3: {
                    System.out.println("Enter first number :");
                    int n1 = ip.nextInt();
                    System.out.println("enter second number :");
                    int n2 = ip.nextInt();
                    c.multiply(n1, n2);
                    break;
                }
                case 4: {
                    System.out.println("Enter first number :");
                    int n1 = ip.nextInt();
                    System.out.println("enter second number :");
                    int n2 = ip.nextInt();
                    c.dicide(n1, n2);
                    break;
                }

            }
        }
    }
}