package jfs_exp1.LC3;
import java.util.*;
public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=30;
        int marks[]=new int[n];
        int count[]=new int[101];
        System.out.println("Enter 30 marks:");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
            count[marks[i]]++;
        }
        for(int i=0;i<=100;i++){
            if(count[i]>0)
                System.out.println(i+" = "+count[i]);
        }
    }
}

