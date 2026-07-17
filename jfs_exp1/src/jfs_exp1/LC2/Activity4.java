package jfs_exp1.LC2;
import java.util.*;

public class Activity4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary to convert to number");
        int bin = sc.nextInt();
        int dec = 0, base = 1;
        while (bin > 0) {
            int rem = bin % 10;
            dec += rem * base;
            base *= 2;
            bin /= 10;
        }
        System.out.println(dec);
    }
}
