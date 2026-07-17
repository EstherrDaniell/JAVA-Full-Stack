package jfs_exp1.LC2;
import java.util.*;

public class Activity2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Digits to find sum:");
        int n = sc.nextInt();
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
