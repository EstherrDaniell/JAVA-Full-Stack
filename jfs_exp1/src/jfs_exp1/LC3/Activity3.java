package jfs_exp1.LC3;
import java.util.*;
public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter 10 numbers:");
        for(int i=0;i<10;i++)
            a[i]=sc.nextInt();
        System.out.println("Reversed Array:");
        for(int i=9;i>=0;i--)
            System.out.print(a[i]+" ");
    }
}

