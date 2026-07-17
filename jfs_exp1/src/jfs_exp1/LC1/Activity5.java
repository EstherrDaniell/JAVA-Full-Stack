package jfs_exp1.LC1;
import java.util.Scanner;
public class Activity5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("Sum = " + sum);
        sc.close();
    }
}


