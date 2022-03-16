// write a program to subtract two matrix array and print the result
import java.util.*;
public class SubtractMatrix
{
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int m=ip.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        System.out.println("enter the first arry: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=ip.nextInt();
            }
        }
        System.out.println("enter the second array: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                b[i][j]=ip.nextInt();
            }
        }
        int c[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                c[i][j]=a[i][j]-b[i][j];
            }
        }
        System.out.println("resultant array: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }


    }
}
