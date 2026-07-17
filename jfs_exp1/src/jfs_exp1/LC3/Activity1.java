package jfs_exp1.LC3;
import java.util.*;
public class Activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10], sum = 0;
        System.out.println("Enter 10 numbers:");
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println("Sum = "+sum);
    }
}


