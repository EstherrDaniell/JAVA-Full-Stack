package jfs_exp1.LC5;
import java.util.*;
public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[15];
        System.out.println("Enter 15 numbers:");
        for(int i=0;i<15;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter element to search: ");
        int x=sc.nextInt();
        boolean found=false;
        for(int i=0;i<15;i++)
            if(a[i]==x){
                System.out.println("Found at position "+i);
                found=true;
            }
        if(!found)
            System.out.println("Element not found");
    }
}

