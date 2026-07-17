package jfs_exp1.LC1;
import java.util.Scanner;
public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int neg = 0, nonNeg = 0;
        System.out.println("Enter 5 numbers:");
        for (int i = 1; i <= 5; i++) {
            int n = sc.nextInt();
            if (n < 0)
                neg++;
            else
                nonNeg++;
        }
        System.out.println("Negative Numbers: " + neg);
        System.out.println("Non-Negative Numbers: " + nonNeg);
        sc.close();
    }
}


